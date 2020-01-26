package com.wahyu.sportify.viewmodel.lastmatch;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;

import com.wahyu.sportify.R;
import com.wahyu.sportify.base.BaseObservableViewModel;
import com.wahyu.sportify.model.lastmatch.Fixture;
import com.wahyu.sportify.model.lastmatch.ResponseLastMatch;
import com.wahyu.sportify.repository.LastMatchRepository;
import com.wahyu.sportify.view.adapter.LastMatchAdapter;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created with love by Ujang Wahyu on 2020-01-26.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */
public class LastMatchViewModel extends BaseObservableViewModel<LastMatchView> implements LastMatchAdapter.OnItemClickCallback{

    private LastMatchRepository repository;
    private final MutableLiveData<ResponseLastMatch> responseLastMatch = new MutableLiveData<>();
    private MutableLiveData<List<Fixture>> fixtureList = new MutableLiveData<List<Fixture>>();
    public ObservableBoolean isRefresh = new ObservableBoolean();
    private LastMatchAdapter adapter;

    @Inject
    public LastMatchViewModel(@NonNull Application application, LastMatchRepository repository) {
        super(application);
        this.repository = repository;
        this.adapter = new LastMatchAdapter(R.layout.item_lastmatch, this);
        this.adapter.setOnItemClickCallback(this);
    }

    public void setAdapter(List<Fixture> last){
        this.adapter.setLastAdapter(last);
        this.adapter.notifyDataSetChanged();
    }

    public LastMatchAdapter getLastMatchAdapter(){
        return adapter;
    }

    public void loadData(){
        getNavigator().showLoading();

        getCompositeDisposable().add(repository.getLastMatch(524, 20)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<ResponseLastMatch>(){

                    @Override
                    public void onSuccess(ResponseLastMatch lastMatch) {
                        getNavigator().hideLoading();
                        isRefresh.set(false);
                        responseLastMatch.setValue(lastMatch);
                        fixtureList.setValue(responseLastMatch.getValue().getApi().getFixtures());
                        setAdapter(getFixtureList().getValue());
                    }

                    @Override
                    public void onError(Throwable e) {
                        isRefresh.set(false);
                        getNavigator().hideLoading();
                    }
                }));
    }

    public String getThumbnail(String imgUrl){
        return imgUrl;
    }

    public MutableLiveData<List<Fixture>> getFixtureList() {
        return fixtureList;
    }

    public void onRefresh() {
        isRefresh.set(true);
        loadData();
    }


    @Override
    public void onItemClicked(Fixture fixture) {

    }
}
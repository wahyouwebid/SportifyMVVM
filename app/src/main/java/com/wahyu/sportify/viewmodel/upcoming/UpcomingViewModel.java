package com.wahyu.sportify.viewmodel.upcoming;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;

import com.wahyu.sportify.R;
import com.wahyu.sportify.base.BaseObservableViewModel;
import com.wahyu.sportify.model.upcoming.Fixture;
import com.wahyu.sportify.model.upcoming.ResponseUpcoming;
import com.wahyu.sportify.repository.UpcomingRepository;
import com.wahyu.sportify.view.adapter.UpcomingAdapter;

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

public class UpcomingViewModel extends BaseObservableViewModel<UpcomingView> implements UpcomingAdapter.OnItemClickCallback{

    private UpcomingRepository repository;
    private final MutableLiveData<ResponseUpcoming> responseUpcoming = new MutableLiveData<>();
    private MutableLiveData<List<Fixture>> fixtureList = new MutableLiveData<List<Fixture>>();
    public ObservableBoolean isRefresh = new ObservableBoolean();
    private UpcomingAdapter adapter;

    @Inject
    public UpcomingViewModel(@NonNull Application application, UpcomingRepository repository) {
        super(application);
        this.repository = repository;
        this.adapter = new UpcomingAdapter(R.layout.item_upcoming, this);
        this.adapter.setOnItemClickCallback(this);
    }

    public void setAdapter(List<Fixture> upcoming){
        this.adapter.setUpcoming(upcoming);
        this.adapter.notifyDataSetChanged();
    }

    public UpcomingAdapter getUpcomingAdapter(){
        return adapter;
    }

    public void loadData(){
        getNavigator().showLoading();

        getCompositeDisposable().add(repository.getUpcomingMatch(524, 20)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<ResponseUpcoming>(){

                    @Override
                    public void onSuccess(ResponseUpcoming lastMatch) {
                        getNavigator().hideLoading();
                        isRefresh.set(false);
                        responseUpcoming.setValue(lastMatch);
                        fixtureList.setValue(responseUpcoming.getValue().getApi().getFixtures());
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
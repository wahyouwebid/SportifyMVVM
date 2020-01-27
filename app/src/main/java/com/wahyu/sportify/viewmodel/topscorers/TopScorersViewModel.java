package com.wahyu.sportify.viewmodel.topscorers;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;

import com.wahyu.sportify.R;
import com.wahyu.sportify.base.BaseObservableViewModel;
import com.wahyu.sportify.model.topscorers.ResponseTopScorers;
import com.wahyu.sportify.model.topscorers.Topscorer;
import com.wahyu.sportify.repository.TopScorersRepository;
import com.wahyu.sportify.view.adapter.TopScorersAdapter;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created with love by Ujang Wahyu on 2020-01-27.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */
public class TopScorersViewModel extends BaseObservableViewModel<TopScorersView> implements TopScorersAdapter.OnItemClickCallback{

    private TopScorersRepository repository;
    private final MutableLiveData<ResponseTopScorers> responseTopScorers = new MutableLiveData<>();
    private MutableLiveData<List<Topscorer>> topscorersList = new MutableLiveData<List<Topscorer>>();
    public ObservableBoolean isRefresh = new ObservableBoolean();
    private TopScorersAdapter adapter;

    @Inject
    public TopScorersViewModel(@NonNull Application application, TopScorersRepository repository) {
        super(application);
        this.repository = repository;
        this.adapter = new TopScorersAdapter(R.layout.item_top_scorers, this);
        this.adapter.setOnItemClickCallback(this);
    }

    public void setAdapter(List<Topscorer> topscorers){
        this.adapter.setTopscorers(topscorers);
        this.adapter.notifyDataSetChanged();
    }

    public TopScorersAdapter getTopScorersAdapter(){
        return adapter;
    }

    public void loadData(){
        getNavigator().showLoading();

        getCompositeDisposable().add(repository.getTopScorers(524)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<ResponseTopScorers>(){

                    @Override
                    public void onSuccess(ResponseTopScorers scorers) {
                        getNavigator().hideLoading();
                        isRefresh.set(false);
                        responseTopScorers.setValue(scorers);
                        topscorersList.setValue(responseTopScorers.getValue().getApi().getTopscorers());
                        setAdapter(getTopscorersList().getValue());
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

    public MutableLiveData<List<Topscorer>> getTopscorersList() {
        return topscorersList;
    }

    public void onRefresh() {
        isRefresh.set(true);
        loadData();
    }


    @Override
    public void onItemClicked(Topscorer topscorer) {

    }
}

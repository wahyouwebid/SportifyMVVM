package com.wahyu.sportify.viewmodel.standing;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.MutableLiveData;

import com.wahyu.sportify.R;
import com.wahyu.sportify.base.BaseObservableViewModel;
import com.wahyu.sportify.model.standing.ResponseStanding;
import com.wahyu.sportify.model.standing.Standing;
import com.wahyu.sportify.repository.StandingRepository;
import com.wahyu.sportify.view.adapter.StandingAdapter;

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
public class StandingViewModel extends BaseObservableViewModel<StandingView> implements StandingAdapter.OnItemClickCallback{

    private StandingRepository repository;
    private final MutableLiveData<ResponseStanding> responseStanding = new MutableLiveData<>();
    private MutableLiveData<List<List<Standing>>> userList = new MutableLiveData<List<List<Standing>>>();
    public ObservableBoolean isRefresh = new ObservableBoolean();
    private StandingAdapter adapter;

    @Inject
    public StandingViewModel(@NonNull Application application, StandingRepository repository) {
        super(application);
        this.repository = repository;
        this.adapter = new StandingAdapter(R.layout.item_standing, this);
        this.adapter.setOnItemClickCallback(this);
    }

    public void setAdapter(List<Standing> standings){
        this.adapter.setStandingAdapter(standings);
        this.adapter.notifyDataSetChanged();
    }

    public StandingAdapter getStandingAdapter(){
        return adapter;
    }

    public void loadData(){
        getNavigator().showLoading();

        getCompositeDisposable().add(repository.getStanding(524)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<ResponseStanding>(){

                    @Override
                    public void onSuccess(ResponseStanding userResponse) {
                        getNavigator().hideLoading();
                        isRefresh.set(false);
                        responseStanding.setValue(userResponse);
                        userList.setValue(responseStanding.getValue().getApi().getStandings());
                        setAdapter(getStandingList().getValue().get(0));
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

    public MutableLiveData<List<List<Standing>>> getStandingList() {
        return userList;
    }

    public void onRefresh() {
        isRefresh.set(true);
        loadData();
    }


    @Override
    public void onItemClicked(Standing standing) {

    }
}

package com.wahyu.sportify.viewmodel.home;

import android.app.Application;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.github.lzyzsd.randomcolor.RandomColor;
import com.wahyu.sportify.BR;
import com.wahyu.sportify.R;
import com.wahyu.sportify.base.BaseObservableViewModel;
import com.wahyu.sportify.model.prediction.Prediction;
import com.wahyu.sportify.model.prediction.ResponsePredictions;
import com.wahyu.sportify.model.team.ResponseTeam;
import com.wahyu.sportify.model.team.Team;
import com.wahyu.sportify.repository.HomeRepository;
import com.wahyu.sportify.view.adapter.TeamAdapter;

import java.util.List;
import java.util.Random;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created with love by Ujang Wahyu on 2020-01-26.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */
public class HomeViewModel extends BaseObservableViewModel<HomeView> implements TeamAdapter.OnItemClickCallback{

    private HomeRepository repository;
    private final MutableLiveData<ResponseTeam> responseTeam = new MutableLiveData<>();
    private final MutableLiveData<ResponsePredictions> responsePredictions = new MutableLiveData<>();
    private MutableLiveData<List<Team>> teamlist = new MutableLiveData<List<Team>>();
    private MutableLiveData<Prediction> prediction = new MutableLiveData<Prediction>();
    public ObservableBoolean isRefresh = new ObservableBoolean();
    private TeamAdapter adapter;
    private LinearLayoutManager layoutManager;
    private RandomColor randomColor = new RandomColor();
    private ViewDataBinding binding ;

    @Inject
    public HomeViewModel(@NonNull Application application, HomeRepository repository) {
        super(application);
        this.repository = repository;
        this.adapter = new TeamAdapter(R.layout.item_team, this);
        this.adapter.setOnItemClickCallback(this);
        this.layoutManager = new LinearLayoutManager(getApplication(), LinearLayoutManager.HORIZONTAL, false);
    }

    public void setAdapter(List<Team> teams){
        this.adapter.setUpcoming(teams);
        this.adapter.notifyDataSetChanged();
    }

    public void setData(MutableLiveData<Prediction> prediction){
        this.prediction = prediction;
        notifyPropertyChanged(com.wahyu.sportify.BR.prediction);
    }

    public TeamAdapter getTeamAdapter(){
        return adapter;
    }

    public void loadDataTeam(){
        //getNavigator().showLoading();

        getCompositeDisposable().add(repository.getTeam(524)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<ResponseTeam>(){

                    @Override
                    public void onSuccess(ResponseTeam team) {
                        getNavigator().hideLoading();
                        isRefresh.set(false);
                        responseTeam.setValue(team);
                        teamlist.setValue(responseTeam.getValue().getApi().getTeams());
                        setAdapter(getTeamlist().getValue());
                    }

                    @Override
                    public void onError(Throwable e) {
                        isRefresh.set(false);
                        getNavigator().hideLoading();
                    }
                }));
    }

    public void loadDataPrediction(){
        getNavigator().showLoading();

        getCompositeDisposable().add(repository.getPrediction(157461)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<ResponsePredictions>(){

                    @Override
                    public void onSuccess(ResponsePredictions predictions) {
                        getNavigator().hideLoading();
                        isRefresh.set(false);
                        responsePredictions.setValue(predictions);
                        prediction.setValue(responsePredictions.getValue().getApi().getPredictions().get(0));
                        setData(prediction);
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

    public int getRandomColor(){
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }

    public MutableLiveData<List<Team>> getTeamlist() {
        return teamlist;
    }

    public MutableLiveData<Prediction> getPrediction() {
        return prediction;
    }

    public void onRefresh() {
        isRefresh.set(true);
        loadDataTeam();
    }


    @Override
    public void onItemClicked(Team team) {

    }
}
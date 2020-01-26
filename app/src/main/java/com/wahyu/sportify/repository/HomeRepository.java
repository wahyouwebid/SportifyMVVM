package com.wahyu.sportify.repository;

import com.wahyu.sportify.model.prediction.ResponsePredictions;
import com.wahyu.sportify.model.team.ResponseTeam;
import com.wahyu.sportify.services.RestService;

import javax.inject.Inject;

import io.reactivex.Single;

import static com.wahyu.sportify.utilities.AppConstants.API_KEY;

/**
 * Created with love by Ujang Wahyu on 2020-01-26.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */
public class HomeRepository {

    private RestService restService;

    @Inject
    public HomeRepository(RestService restService) {
        this.restService = restService;
    }

    public Single<ResponseTeam> getTeam(int id){
        return restService.getTeam(API_KEY,id);
    }

    public Single<ResponsePredictions> getPrediction(int id){
        return restService.getPrediction(API_KEY,id);
    }
}

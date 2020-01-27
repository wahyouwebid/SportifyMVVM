package com.wahyu.sportify.repository;

import com.wahyu.sportify.model.topscorers.ResponseTopScorers;
import com.wahyu.sportify.services.RestService;

import javax.inject.Inject;

import io.reactivex.Single;

import static com.wahyu.sportify.utilities.AppConstants.API_KEY;

/**
 * Created with love by Ujang Wahyu on 2020-01-27.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */
public class TopScorersRepository {

    private RestService restService;

    @Inject
    public TopScorersRepository(RestService restService) {
        this.restService = restService;
    }

    public Single<ResponseTopScorers> getTopScorers(int id){
        return restService.getTopScorers(API_KEY, id);
    }
}

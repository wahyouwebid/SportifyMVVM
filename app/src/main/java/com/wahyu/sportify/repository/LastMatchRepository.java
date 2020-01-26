package com.wahyu.sportify.repository;

import com.wahyu.sportify.model.lastmatch.ResponseLastMatch;
import com.wahyu.sportify.model.standing.ResponseStanding;
import com.wahyu.sportify.services.RestService;

import javax.inject.Inject;

import io.reactivex.Single;

import static com.wahyu.sportify.utilities.AppConstants.API_KEY;

/**
 * Created with love by Ujang Wahyu on 2020-01-26.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */
public class LastMatchRepository {
    private RestService restService;

    @Inject
    public LastMatchRepository(RestService restService) {
        this.restService = restService;
    }

    public Single<ResponseLastMatch> getLastMatch(int id, int number){
        return restService.getLastMatch(API_KEY, id, number);
    }
}

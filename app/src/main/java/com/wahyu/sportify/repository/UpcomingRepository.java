package com.wahyu.sportify.repository;

import com.wahyu.sportify.model.lastmatch.ResponseLastMatch;
import com.wahyu.sportify.model.upcoming.ResponseUpcoming;
import com.wahyu.sportify.services.RestService;

import javax.inject.Inject;

import io.reactivex.Single;

import static com.wahyu.sportify.utilities.AppConstants.API_KEY;

/**
 * Created with love by Ujang Wahyu on 2020-01-26.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */
public class UpcomingRepository {
    private RestService restService;

    @Inject
    public UpcomingRepository(RestService restService) {
        this.restService = restService;
    }

    public Single<ResponseUpcoming> getUpcomingMatch(int id, int number){
        return restService.getUpcomingMatch(API_KEY, id, number);
    }
}

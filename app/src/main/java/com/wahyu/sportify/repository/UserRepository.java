package com.wahyu.sportify.repository;

import com.wahyu.sportify.model.user.UserResponse;
import com.wahyu.sportify.services.RestService;

import javax.inject.Inject;

import io.reactivex.Single;

/**
 * Created with love by Ujang Wahyu on 2020-01-24.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */
public class UserRepository {
    private RestService restService;

    @Inject
    public UserRepository(RestService restService) {
        this.restService = restService;
    }

    public Single<UserResponse> getUser(){
        return restService.getUser();
    }
}

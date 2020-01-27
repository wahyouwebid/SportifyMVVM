package com.wahyu.sportify.services;

import com.wahyu.sportify.model.lastmatch.ResponseLastMatch;
import com.wahyu.sportify.model.prediction.ResponsePredictions;
import com.wahyu.sportify.model.standing.ResponseStanding;
import com.wahyu.sportify.model.team.ResponseTeam;
import com.wahyu.sportify.model.topscorers.ResponseTopScorers;
import com.wahyu.sportify.model.upcoming.ResponseUpcoming;
import com.wahyu.sportify.model.user.UserResponse;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

/**
 * Created with love by Ujang Wahyu on 2020-01-08.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */

public interface RestService {

    @GET("cfKFbgAwzm")
    Single<UserResponse> getUser();

    @GET("leagueTable/{id}")
    Single<ResponseStanding> getStanding(
            @Header("x-rapidapi-key") String apiKey,
            @Path("id") int id );

    @GET("fixtures/league/{id}/last/{number}")
    Single<ResponseLastMatch> getLastMatch(
            @Header("x-rapidapi-key") String apiKey,
            @Path("id") int id,
            @Path("number") int number );

    @GET("fixtures/league/{id}/next/{number}")
    Single<ResponseUpcoming> getUpcomingMatch(
            @Header("x-rapidapi-key") String apiKey,
            @Path("id") int id,
            @Path("number") int number );

    @GET("teams/league/{id}")
    Single<ResponseTeam> getTeam(
            @Header("x-rapidapi-key") String apiKey,
            @Path("id") int id);

    @GET("predictions/{id}")
    Single<ResponsePredictions> getPrediction(
            @Header("x-rapidapi-key") String apiKey,
            @Path("id") int id);

    @GET("topscorers/{id}")
    Single<ResponseTopScorers> getTopScorers(
            @Header("x-rapidapi-key") String apiKey,
            @Path("id") int id);


}

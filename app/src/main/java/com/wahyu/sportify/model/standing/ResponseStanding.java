
package com.wahyu.sportify.model.standing;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class ResponseStanding {

    @SerializedName("api")
    private Api mApi;

    public Api getApi() {
        return mApi;
    }

    public void setApi(Api api) {
        mApi = api;
    }

}

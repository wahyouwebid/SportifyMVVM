
package com.wahyu.sportify.model.topscorers;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class ResponseTopScorers {

    @SerializedName("api")
    private Api mApi;

    public Api getApi() {
        return mApi;
    }

    public void setApi(Api api) {
        mApi = api;
    }

}

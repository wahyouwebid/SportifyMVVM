
package com.wahyu.sportify.model.upcoming;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class ResponseUpcoming {

    @SerializedName("api")
    private Api mApi;

    public Api getApi() {
        return mApi;
    }

    public void setApi(Api api) {
        mApi = api;
    }

}

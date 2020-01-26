
package com.wahyu.sportify.model.prediction;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class ResponsePredictions {

    @SerializedName("api")
    private Api mApi;

    public Api getApi() {
        return mApi;
    }

    public void setApi(Api api) {
        mApi = api;
    }

}

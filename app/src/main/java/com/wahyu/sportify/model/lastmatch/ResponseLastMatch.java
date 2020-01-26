
package com.wahyu.sportify.model.lastmatch;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class ResponseLastMatch {

    @SerializedName("api")
    private Api mApi;

    public Api getApi() {
        return mApi;
    }

    public void setApi(Api api) {
        mApi = api;
    }

}

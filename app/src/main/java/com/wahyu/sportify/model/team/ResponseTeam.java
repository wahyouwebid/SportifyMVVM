
package com.wahyu.sportify.model.team;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class ResponseTeam {

    @SerializedName("api")
    private Api mApi;

    public Api getApi() {
        return mApi;
    }

    public void setApi(Api api) {
        mApi = api;
    }

}

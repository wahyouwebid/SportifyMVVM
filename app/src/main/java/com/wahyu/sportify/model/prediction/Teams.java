
package com.wahyu.sportify.model.prediction;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Teams {

    @SerializedName("away")
    private Away mAway;
    @SerializedName("home")
    private Home mHome;

    public Away getAway() {
        return mAway;
    }

    public void setAway(Away away) {
        mAway = away;
    }

    public Home getHome() {
        return mHome;
    }

    public void setHome(Home home) {
        mHome = home;
    }

}

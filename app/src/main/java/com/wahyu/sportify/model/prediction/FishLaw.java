
package com.wahyu.sportify.model.prediction;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class FishLaw {

    @SerializedName("away")
    private String mAway;
    @SerializedName("home")
    private String mHome;

    public String getAway() {
        return mAway;
    }

    public void setAway(String away) {
        mAway = away;
    }

    public String getHome() {
        return mHome;
    }

    public void setHome(String home) {
        mHome = home;
    }

}

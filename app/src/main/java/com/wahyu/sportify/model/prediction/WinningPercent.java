
package com.wahyu.sportify.model.prediction;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class WinningPercent {

    @SerializedName("away")
    private String mAway;
    @SerializedName("draws")
    private String mDraws;
    @SerializedName("home")
    private String mHome;

    public String getAway() {
        return mAway;
    }

    public void setAway(String away) {
        mAway = away;
    }

    public String getDraws() {
        return mDraws;
    }

    public void setDraws(String draws) {
        mDraws = draws;
    }

    public String getHome() {
        return mHome;
    }

    public void setHome(String home) {
        mHome = home;
    }

}

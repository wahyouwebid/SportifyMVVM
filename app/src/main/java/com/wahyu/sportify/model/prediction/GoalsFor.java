
package com.wahyu.sportify.model.prediction;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class GoalsFor {

    @SerializedName("away")
    private Long mAway;
    @SerializedName("home")
    private Long mHome;
    @SerializedName("total")
    private Long mTotal;

    public Long getAway() {
        return mAway;
    }

    public void setAway(Long away) {
        mAway = away;
    }

    public Long getHome() {
        return mHome;
    }

    public void setHome(Long home) {
        mHome = home;
    }

    public Long getTotal() {
        return mTotal;
    }

    public void setTotal(Long total) {
        mTotal = total;
    }

}

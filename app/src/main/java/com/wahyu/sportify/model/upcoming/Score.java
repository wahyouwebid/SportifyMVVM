
package com.wahyu.sportify.model.upcoming;
import com.google.gson.annotations.SerializedName;
@SuppressWarnings("unused")
public class Score {

    @SerializedName("extratime")
    private Long mExtratime;
    @SerializedName("fulltime")
    private Long mFulltime;
    @SerializedName("halftime")
    private Long mHalftime;
    @SerializedName("penalty")
    private Long mPenalty;

    public Long getExtratime() {
        return mExtratime;
    }

    public void setExtratime(Long extratime) {
        mExtratime = extratime;
    }

    public Long getFulltime() {
        return mFulltime;
    }

    public void setFulltime(Long fulltime) {
        mFulltime = fulltime;
    }

    public Long getHalftime() {
        return mHalftime;
    }

    public void setHalftime(Long halftime) {
        mHalftime = halftime;
    }

    public Long getPenalty() {
        return mPenalty;
    }

    public void setPenalty(Long penalty) {
        mPenalty = penalty;
    }

}

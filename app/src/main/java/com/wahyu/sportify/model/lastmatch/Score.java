
package com.wahyu.sportify.model.lastmatch;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Score {

    @SerializedName("extratime")
    private Object mExtratime;
    @SerializedName("fulltime")
    private String mFulltime;
    @SerializedName("halftime")
    private String mHalftime;
    @SerializedName("penalty")
    private Object mPenalty;

    public Object getExtratime() {
        return mExtratime;
    }

    public void setExtratime(Object extratime) {
        mExtratime = extratime;
    }

    public String getFulltime() {
        return mFulltime;
    }

    public void setFulltime(String fulltime) {
        mFulltime = fulltime;
    }

    public String getHalftime() {
        return mHalftime;
    }

    public void setHalftime(String halftime) {
        mHalftime = halftime;
    }

    public Object getPenalty() {
        return mPenalty;
    }

    public void setPenalty(Object penalty) {
        mPenalty = penalty;
    }

}

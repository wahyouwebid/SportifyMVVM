
package com.wahyu.sportify.model.topscorers;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Penalty {

    @SerializedName("commited")
    private Object mCommited;
    @SerializedName("missed")
    private Long mMissed;
    @SerializedName("saved")
    private Object mSaved;
    @SerializedName("success")
    private Long mSuccess;
    @SerializedName("won")
    private Long mWon;

    public Object getCommited() {
        return mCommited;
    }

    public void setCommited(Object commited) {
        mCommited = commited;
    }

    public Long getMissed() {
        return mMissed;
    }

    public void setMissed(Long missed) {
        mMissed = missed;
    }

    public Object getSaved() {
        return mSaved;
    }

    public void setSaved(Object saved) {
        mSaved = saved;
    }

    public Long getSuccess() {
        return mSuccess;
    }

    public void setSuccess(Long success) {
        mSuccess = success;
    }

    public Long getWon() {
        return mWon;
    }

    public void setWon(Long won) {
        mWon = won;
    }

}


package com.wahyu.sportify.model.standing;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Away {

    @SerializedName("draw")
    private Long mDraw;
    @SerializedName("goalsAgainst")
    private Long mGoalsAgainst;
    @SerializedName("goalsFor")
    private Long mGoalsFor;
    @SerializedName("lose")
    private Long mLose;
    @SerializedName("matchsPlayed")
    private Long mMatchsPlayed;
    @SerializedName("win")
    private Long mWin;

    public Long getDraw() {
        return mDraw;
    }

    public void setDraw(Long draw) {
        mDraw = draw;
    }

    public Long getGoalsAgainst() {
        return mGoalsAgainst;
    }

    public void setGoalsAgainst(Long goalsAgainst) {
        mGoalsAgainst = goalsAgainst;
    }

    public Long getGoalsFor() {
        return mGoalsFor;
    }

    public void setGoalsFor(Long goalsFor) {
        mGoalsFor = goalsFor;
    }

    public Long getLose() {
        return mLose;
    }

    public void setLose(Long lose) {
        mLose = lose;
    }

    public Long getMatchsPlayed() {
        return mMatchsPlayed;
    }

    public void setMatchsPlayed(Long matchsPlayed) {
        mMatchsPlayed = matchsPlayed;
    }

    public Long getWin() {
        return mWin;
    }

    public void setWin(Long win) {
        mWin = win;
    }

}


package com.wahyu.sportify.model.prediction;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Prediction {

    @SerializedName("advice")
    private String mAdvice;
    @SerializedName("comparison")
    private Comparison mComparison;
    @SerializedName("goals_away")
    private String mGoalsAway;
    @SerializedName("goals_home")
    private String mGoalsHome;
    @SerializedName("h2h")
    private List<H2h> mH2h;
    @SerializedName("match_winner")
    private String mMatchWinner;
    @SerializedName("teams")
    private Teams mTeams;
    @SerializedName("under_over")
    private Object mUnderOver;
    @SerializedName("winning_percent")
    private WinningPercent mWinningPercent;

    public String getAdvice() {
        return mAdvice;
    }

    public void setAdvice(String advice) {
        mAdvice = advice;
    }

    public Comparison getComparison() {
        return mComparison;
    }

    public void setComparison(Comparison comparison) {
        mComparison = comparison;
    }

    public String getGoalsAway() {
        return mGoalsAway;
    }

    public void setGoalsAway(String goalsAway) {
        mGoalsAway = goalsAway;
    }

    public String getGoalsHome() {
        return mGoalsHome;
    }

    public void setGoalsHome(String goalsHome) {
        mGoalsHome = goalsHome;
    }

    public List<H2h> getH2h() {
        return mH2h;
    }

    public void setH2h(List<H2h> h2h) {
        mH2h = h2h;
    }

    public String getMatchWinner() {
        return mMatchWinner;
    }

    public void setMatchWinner(String matchWinner) {
        mMatchWinner = matchWinner;
    }

    public Teams getTeams() {
        return mTeams;
    }

    public void setTeams(Teams teams) {
        mTeams = teams;
    }

    public Object getUnderOver() {
        return mUnderOver;
    }

    public void setUnderOver(Object underOver) {
        mUnderOver = underOver;
    }

    public WinningPercent getWinningPercent() {
        return mWinningPercent;
    }

    public void setWinningPercent(WinningPercent winningPercent) {
        mWinningPercent = winningPercent;
    }

}

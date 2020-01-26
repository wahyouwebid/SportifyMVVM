
package com.wahyu.sportify.model.prediction;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class AllLastMatches {

    @SerializedName("goals")
    private Goals mGoals;
    @SerializedName("goalsAvg")
    private GoalsAvg mGoalsAvg;
    @SerializedName("matchs")
    private Matchs mMatchs;

    public Goals getGoals() {
        return mGoals;
    }

    public void setGoals(Goals goals) {
        mGoals = goals;
    }

    public GoalsAvg getGoalsAvg() {
        return mGoalsAvg;
    }

    public void setGoalsAvg(GoalsAvg goalsAvg) {
        mGoalsAvg = goalsAvg;
    }

    public Matchs getMatchs() {
        return mMatchs;
    }

    public void setMatchs(Matchs matchs) {
        mMatchs = matchs;
    }

}

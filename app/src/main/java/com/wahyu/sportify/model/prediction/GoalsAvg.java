
package com.wahyu.sportify.model.prediction;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class GoalsAvg {

    @SerializedName("goalsAgainst")
    private GoalsAgainst mGoalsAgainst;
    @SerializedName("goalsFor")
    private GoalsFor mGoalsFor;

    public GoalsAgainst getGoalsAgainst() {
        return mGoalsAgainst;
    }

    public void setGoalsAgainst(GoalsAgainst goalsAgainst) {
        mGoalsAgainst = goalsAgainst;
    }

    public GoalsFor getGoalsFor() {
        return mGoalsFor;
    }

    public void setGoalsFor(GoalsFor goalsFor) {
        mGoalsFor = goalsFor;
    }

}


package com.wahyu.sportify.model.prediction;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Last5Matches {

    @SerializedName("att")
    private String mAtt;
    @SerializedName("def")
    private String mDef;
    @SerializedName("forme")
    private String mForme;
    @SerializedName("goals")
    private Long mGoals;
    @SerializedName("goals_against")
    private Long mGoalsAgainst;
    @SerializedName("goals_against_avg")
    private Double mGoalsAgainstAvg;
    @SerializedName("goals_avg")
    private Double mGoalsAvg;

    public String getAtt() {
        return mAtt;
    }

    public void setAtt(String att) {
        mAtt = att;
    }

    public String getDef() {
        return mDef;
    }

    public void setDef(String def) {
        mDef = def;
    }

    public String getForme() {
        return mForme;
    }

    public void setForme(String forme) {
        mForme = forme;
    }

    public Long getGoals() {
        return mGoals;
    }

    public void setGoals(Long goals) {
        mGoals = goals;
    }

    public Long getGoalsAgainst() {
        return mGoalsAgainst;
    }

    public void setGoalsAgainst(Long goalsAgainst) {
        mGoalsAgainst = goalsAgainst;
    }

    public Double getGoalsAgainstAvg() {
        return mGoalsAgainstAvg;
    }

    public void setGoalsAgainstAvg(Double goalsAgainstAvg) {
        mGoalsAgainstAvg = goalsAgainstAvg;
    }

    public Double getGoalsAvg() {
        return mGoalsAvg;
    }

    public void setGoalsAvg(Double goalsAvg) {
        mGoalsAvg = goalsAvg;
    }

}


package com.wahyu.sportify.model.prediction;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Comparison {

    @SerializedName("att")
    private Att mAtt;
    @SerializedName("def")
    private Def mDef;
    @SerializedName("fish_law")
    private FishLaw mFishLaw;
    @SerializedName("forme")
    private Forme mForme;
    @SerializedName("goals_h2h")
    private GoalsH2h mGoalsH2h;
    @SerializedName("h2h")
    private H2h mH2h;

    public Att getAtt() {
        return mAtt;
    }

    public void setAtt(Att att) {
        mAtt = att;
    }

    public Def getDef() {
        return mDef;
    }

    public void setDef(Def def) {
        mDef = def;
    }

    public FishLaw getFishLaw() {
        return mFishLaw;
    }

    public void setFishLaw(FishLaw fishLaw) {
        mFishLaw = fishLaw;
    }

    public Forme getForme() {
        return mForme;
    }

    public void setForme(Forme forme) {
        mForme = forme;
    }

    public GoalsH2h getGoalsH2h() {
        return mGoalsH2h;
    }

    public void setGoalsH2h(GoalsH2h goalsH2h) {
        mGoalsH2h = goalsH2h;
    }

    public H2h getH2h() {
        return mH2h;
    }

    public void setH2h(H2h h2h) {
        mH2h = h2h;
    }

}

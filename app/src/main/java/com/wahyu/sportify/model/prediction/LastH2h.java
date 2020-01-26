
package com.wahyu.sportify.model.prediction;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class LastH2h {

    @SerializedName("draws")
    private Draws mDraws;
    @SerializedName("loses")
    private Loses mLoses;
    @SerializedName("played")
    private Played mPlayed;
    @SerializedName("wins")
    private Wins mWins;

    public Draws getDraws() {
        return mDraws;
    }

    public void setDraws(Draws draws) {
        mDraws = draws;
    }

    public Loses getLoses() {
        return mLoses;
    }

    public void setLoses(Loses loses) {
        mLoses = loses;
    }

    public Played getPlayed() {
        return mPlayed;
    }

    public void setPlayed(Played played) {
        mPlayed = played;
    }

    public Wins getWins() {
        return mWins;
    }

    public void setWins(Wins wins) {
        mWins = wins;
    }

}

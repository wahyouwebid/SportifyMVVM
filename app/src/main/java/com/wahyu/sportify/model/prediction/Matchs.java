
package com.wahyu.sportify.model.prediction;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Matchs {

    @SerializedName("draws")
    private Draws mDraws;
    @SerializedName("loses")
    private Loses mLoses;
    @SerializedName("matchsPlayed")
    private MatchsPlayed mMatchsPlayed;
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

    public MatchsPlayed getMatchsPlayed() {
        return mMatchsPlayed;
    }

    public void setMatchsPlayed(MatchsPlayed matchsPlayed) {
        mMatchsPlayed = matchsPlayed;
    }

    public Wins getWins() {
        return mWins;
    }

    public void setWins(Wins wins) {
        mWins = wins;
    }

}

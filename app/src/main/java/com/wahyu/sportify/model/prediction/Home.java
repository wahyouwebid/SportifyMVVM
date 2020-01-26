
package com.wahyu.sportify.model.prediction;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Home {

    @SerializedName("all_last_matches")
    private AllLastMatches mAllLastMatches;
    @SerializedName("last_5_matches")
    private Last5Matches mLast5Matches;
    @SerializedName("last_h2h")
    private LastH2h mLastH2h;
    @SerializedName("team_id")
    private Long mTeamId;
    @SerializedName("team_name")
    private String mTeamName;

    public AllLastMatches getAllLastMatches() {
        return mAllLastMatches;
    }

    public void setAllLastMatches(AllLastMatches allLastMatches) {
        mAllLastMatches = allLastMatches;
    }

    public Last5Matches getLast5Matches() {
        return mLast5Matches;
    }

    public void setLast5Matches(Last5Matches last5Matches) {
        mLast5Matches = last5Matches;
    }

    public LastH2h getLastH2h() {
        return mLastH2h;
    }

    public void setLastH2h(LastH2h lastH2h) {
        mLastH2h = lastH2h;
    }

    public Long getTeamId() {
        return mTeamId;
    }

    public void setTeamId(Long teamId) {
        mTeamId = teamId;
    }

    public String getTeamName() {
        return mTeamName;
    }

    public void setTeamName(String teamName) {
        mTeamName = teamName;
    }

}

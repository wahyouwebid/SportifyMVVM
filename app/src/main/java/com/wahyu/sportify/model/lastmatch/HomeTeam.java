
package com.wahyu.sportify.model.lastmatch;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class HomeTeam {

    @SerializedName("logo")
    private String mLogo;
    @SerializedName("team_id")
    private Long mTeamId;
    @SerializedName("team_name")
    private String mTeamName;

    public String getLogo() {
        return mLogo;
    }

    public void setLogo(String logo) {
        mLogo = logo;
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

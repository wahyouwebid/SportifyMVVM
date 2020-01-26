
package com.wahyu.sportify.model.standing;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Standing {

    @SerializedName("all")
    private All mAll;
    @SerializedName("away")
    private Away mAway;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("forme")
    private String mForme;
    @SerializedName("goalsDiff")
    private Long mGoalsDiff;
    @SerializedName("group")
    private String mGroup;
    @SerializedName("home")
    private Home mHome;
    @SerializedName("lastUpdate")
    private String mLastUpdate;
    @SerializedName("logo")
    private String mLogo;
    @SerializedName("points")
    private Long mPoints;
    @SerializedName("rank")
    private Long mRank;
    @SerializedName("status")
    private String mStatus;
    @SerializedName("team_id")
    private Long mTeamId;
    @SerializedName("teamName")
    private String mTeamName;

    public All getAll() {
        return mAll;
    }

    public void setAll(All all) {
        mAll = all;
    }

    public Away getAway() {
        return mAway;
    }

    public void setAway(Away away) {
        mAway = away;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getForme() {
        return mForme;
    }

    public void setForme(String forme) {
        mForme = forme;
    }

    public Long getGoalsDiff() {
        return mGoalsDiff;
    }

    public void setGoalsDiff(Long goalsDiff) {
        mGoalsDiff = goalsDiff;
    }

    public String getGroup() {
        return mGroup;
    }

    public void setGroup(String group) {
        mGroup = group;
    }

    public Home getHome() {
        return mHome;
    }

    public void setHome(Home home) {
        mHome = home;
    }

    public String getLastUpdate() {
        return mLastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        mLastUpdate = lastUpdate;
    }

    public String getLogo() {
        return mLogo;
    }

    public void setLogo(String logo) {
        mLogo = logo;
    }

    public Long getPoints() {
        return mPoints;
    }

    public void setPoints(Long points) {
        mPoints = points;
    }

    public Long getRank() {
        return mRank;
    }

    public void setRank(Long rank) {
        mRank = rank;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
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

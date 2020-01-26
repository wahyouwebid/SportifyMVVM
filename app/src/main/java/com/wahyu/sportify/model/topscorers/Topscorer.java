
package com.wahyu.sportify.model.topscorers;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Topscorer {

    @SerializedName("cards")
    private Cards mCards;
    @SerializedName("firstname")
    private String mFirstname;
    @SerializedName("games")
    private Games mGames;
    @SerializedName("goals")
    private Goals mGoals;
    @SerializedName("lastname")
    private String mLastname;
    @SerializedName("nationality")
    private String mNationality;
    @SerializedName("penalty")
    private Penalty mPenalty;
    @SerializedName("player_id")
    private Long mPlayerId;
    @SerializedName("player_name")
    private String mPlayerName;
    @SerializedName("position")
    private String mPosition;
    @SerializedName("shots")
    private Shots mShots;
    @SerializedName("team_id")
    private Long mTeamId;
    @SerializedName("team_name")
    private String mTeamName;

    public Cards getCards() {
        return mCards;
    }

    public void setCards(Cards cards) {
        mCards = cards;
    }

    public String getFirstname() {
        return mFirstname;
    }

    public void setFirstname(String firstname) {
        mFirstname = firstname;
    }

    public Games getGames() {
        return mGames;
    }

    public void setGames(Games games) {
        mGames = games;
    }

    public Goals getGoals() {
        return mGoals;
    }

    public void setGoals(Goals goals) {
        mGoals = goals;
    }

    public String getLastname() {
        return mLastname;
    }

    public void setLastname(String lastname) {
        mLastname = lastname;
    }

    public String getNationality() {
        return mNationality;
    }

    public void setNationality(String nationality) {
        mNationality = nationality;
    }

    public Penalty getPenalty() {
        return mPenalty;
    }

    public void setPenalty(Penalty penalty) {
        mPenalty = penalty;
    }

    public Long getPlayerId() {
        return mPlayerId;
    }

    public void setPlayerId(Long playerId) {
        mPlayerId = playerId;
    }

    public String getPlayerName() {
        return mPlayerName;
    }

    public void setPlayerName(String playerName) {
        mPlayerName = playerName;
    }

    public String getPosition() {
        return mPosition;
    }

    public void setPosition(String position) {
        mPosition = position;
    }

    public Shots getShots() {
        return mShots;
    }

    public void setShots(Shots shots) {
        mShots = shots;
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

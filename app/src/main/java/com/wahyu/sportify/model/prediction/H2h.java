
package com.wahyu.sportify.model.prediction;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class H2h {

    @SerializedName("away")
    private String mAway;
    @SerializedName("awayTeam")
    private AwayTeam mAwayTeam;
    @SerializedName("elapsed")
    private Long mElapsed;
    @SerializedName("event_date")
    private String mEventDate;
    @SerializedName("event_timestamp")
    private Long mEventTimestamp;
    @SerializedName("firstHalfStart")
    private Long mFirstHalfStart;
    @SerializedName("fixture_id")
    private Long mFixtureId;
    @SerializedName("goalsAwayTeam")
    private Long mGoalsAwayTeam;
    @SerializedName("goalsHomeTeam")
    private Long mGoalsHomeTeam;
    @SerializedName("home")
    private String mHome;
    @SerializedName("homeTeam")
    private HomeTeam mHomeTeam;
    @SerializedName("league")
    private League mLeague;
    @SerializedName("league_id")
    private Long mLeagueId;
    @SerializedName("referee")
    private String mReferee;
    @SerializedName("round")
    private String mRound;
    @SerializedName("score")
    private Score mScore;
    @SerializedName("secondHalfStart")
    private Long mSecondHalfStart;
    @SerializedName("status")
    private String mStatus;
    @SerializedName("statusShort")
    private String mStatusShort;
    @SerializedName("venue")
    private String mVenue;

    public String getAway() {
        return mAway;
    }

    public void setAway(String away) {
        mAway = away;
    }

    public AwayTeam getAwayTeam() {
        return mAwayTeam;
    }

    public void setAwayTeam(AwayTeam awayTeam) {
        mAwayTeam = awayTeam;
    }

    public Long getElapsed() {
        return mElapsed;
    }

    public void setElapsed(Long elapsed) {
        mElapsed = elapsed;
    }

    public String getEventDate() {
        return mEventDate;
    }

    public void setEventDate(String eventDate) {
        mEventDate = eventDate;
    }

    public Long getEventTimestamp() {
        return mEventTimestamp;
    }

    public void setEventTimestamp(Long eventTimestamp) {
        mEventTimestamp = eventTimestamp;
    }

    public Long getFirstHalfStart() {
        return mFirstHalfStart;
    }

    public void setFirstHalfStart(Long firstHalfStart) {
        mFirstHalfStart = firstHalfStart;
    }

    public Long getFixtureId() {
        return mFixtureId;
    }

    public void setFixtureId(Long fixtureId) {
        mFixtureId = fixtureId;
    }

    public Long getGoalsAwayTeam() {
        return mGoalsAwayTeam;
    }

    public void setGoalsAwayTeam(Long goalsAwayTeam) {
        mGoalsAwayTeam = goalsAwayTeam;
    }

    public Long getGoalsHomeTeam() {
        return mGoalsHomeTeam;
    }

    public void setGoalsHomeTeam(Long goalsHomeTeam) {
        mGoalsHomeTeam = goalsHomeTeam;
    }

    public String getHome() {
        return mHome;
    }

    public void setHome(String home) {
        mHome = home;
    }

    public HomeTeam getHomeTeam() {
        return mHomeTeam;
    }

    public void setHomeTeam(HomeTeam homeTeam) {
        mHomeTeam = homeTeam;
    }

    public League getLeague() {
        return mLeague;
    }

    public void setLeague(League league) {
        mLeague = league;
    }

    public Long getLeagueId() {
        return mLeagueId;
    }

    public void setLeagueId(Long leagueId) {
        mLeagueId = leagueId;
    }

    public String getReferee() {
        return mReferee;
    }

    public void setReferee(String referee) {
        mReferee = referee;
    }

    public String getRound() {
        return mRound;
    }

    public void setRound(String round) {
        mRound = round;
    }

    public Score getScore() {
        return mScore;
    }

    public void setScore(Score score) {
        mScore = score;
    }

    public Long getSecondHalfStart() {
        return mSecondHalfStart;
    }

    public void setSecondHalfStart(Long secondHalfStart) {
        mSecondHalfStart = secondHalfStart;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

    public String getStatusShort() {
        return mStatusShort;
    }

    public void setStatusShort(String statusShort) {
        mStatusShort = statusShort;
    }

    public String getVenue() {
        return mVenue;
    }

    public void setVenue(String venue) {
        mVenue = venue;
    }

}

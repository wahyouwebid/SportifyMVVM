
package com.wahyu.sportify.model.upcoming;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Fixture {

    @SerializedName("awayTeam")
    private AwayTeam mAwayTeam;
    @SerializedName("elapsed")
    private Long mElapsed;
    @SerializedName("event_date")
    private String mEventDate;
    @SerializedName("event_timestamp")
    private Long mEventTimestamp;
    @SerializedName("firstHalfStart")
    private Object mFirstHalfStart;
    @SerializedName("fixture_id")
    private Long mFixtureId;
    @SerializedName("goalsAwayTeam")
    private Object mGoalsAwayTeam;
    @SerializedName("goalsHomeTeam")
    private Object mGoalsHomeTeam;
    @SerializedName("homeTeam")
    private HomeTeam mHomeTeam;
    @SerializedName("league")
    private League mLeague;
    @SerializedName("league_id")
    private Long mLeagueId;
    @SerializedName("referee")
    private Object mReferee;
    @SerializedName("round")
    private String mRound;
    @SerializedName("score")
    private Score mScore;
    @SerializedName("secondHalfStart")
    private Object mSecondHalfStart;
    @SerializedName("status")
    private String mStatus;
    @SerializedName("statusShort")
    private String mStatusShort;
    @SerializedName("venue")
    private String mVenue;

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

    public Object getFirstHalfStart() {
        return mFirstHalfStart;
    }

    public void setFirstHalfStart(Object firstHalfStart) {
        mFirstHalfStart = firstHalfStart;
    }

    public Long getFixtureId() {
        return mFixtureId;
    }

    public void setFixtureId(Long fixtureId) {
        mFixtureId = fixtureId;
    }

    public Object getGoalsAwayTeam() {
        return mGoalsAwayTeam;
    }

    public void setGoalsAwayTeam(Object goalsAwayTeam) {
        mGoalsAwayTeam = goalsAwayTeam;
    }

    public Object getGoalsHomeTeam() {
        return mGoalsHomeTeam;
    }

    public void setGoalsHomeTeam(Object goalsHomeTeam) {
        mGoalsHomeTeam = goalsHomeTeam;
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

    public Object getReferee() {
        return mReferee;
    }

    public void setReferee(Object referee) {
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

    public Object getSecondHalfStart() {
        return mSecondHalfStart;
    }

    public void setSecondHalfStart(Object secondHalfStart) {
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

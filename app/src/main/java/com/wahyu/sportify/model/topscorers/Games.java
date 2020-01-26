
package com.wahyu.sportify.model.topscorers;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Games {

    @SerializedName("appearences")
    private Long mAppearences;
    @SerializedName("minutes_played")
    private Long mMinutesPlayed;

    public Long getAppearences() {
        return mAppearences;
    }

    public void setAppearences(Long appearences) {
        mAppearences = appearences;
    }

    public Long getMinutesPlayed() {
        return mMinutesPlayed;
    }

    public void setMinutesPlayed(Long minutesPlayed) {
        mMinutesPlayed = minutesPlayed;
    }

}

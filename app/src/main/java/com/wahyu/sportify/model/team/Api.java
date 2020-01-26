
package com.wahyu.sportify.model.team;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Api {

    @SerializedName("results")
    private Long mResults;
    @SerializedName("teams")
    private List<Team> mTeams;

    public Long getResults() {
        return mResults;
    }

    public void setResults(Long results) {
        mResults = results;
    }

    public List<Team> getTeams() {
        return mTeams;
    }

    public void setTeams(List<Team> teams) {
        mTeams = teams;
    }

}

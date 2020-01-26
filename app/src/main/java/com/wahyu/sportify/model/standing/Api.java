
package com.wahyu.sportify.model.standing;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Api {

    @SerializedName("results")
    private Long mResults;
    @SerializedName("standings")
    private List<List<Standing>> mStandings;

    public Long getResults() {
        return mResults;
    }

    public void setResults(Long results) {
        mResults = results;
    }

    public List<List<Standing>> getStandings() {
        return mStandings;
    }

    public void setStandings(List<List<Standing>> standings) {
        mStandings = standings;
    }

}

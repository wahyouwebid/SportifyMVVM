
package com.wahyu.sportify.model.upcoming;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Api {

    @SerializedName("fixtures")
    private List<Fixture> mFixtures;
    @SerializedName("results")
    private Long mResults;

    public List<Fixture> getFixtures() {
        return mFixtures;
    }

    public void setFixtures(List<Fixture> fixtures) {
        mFixtures = fixtures;
    }

    public Long getResults() {
        return mResults;
    }

    public void setResults(Long results) {
        mResults = results;
    }

}

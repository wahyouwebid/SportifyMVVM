
package com.wahyu.sportify.model.topscorers;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Api {

    @SerializedName("results")
    private Long mResults;
    @SerializedName("topscorers")
    private List<Topscorer> mTopscorers;

    public Long getResults() {
        return mResults;
    }

    public void setResults(Long results) {
        mResults = results;
    }

    public List<Topscorer> getTopscorers() {
        return mTopscorers;
    }

    public void setTopscorers(List<Topscorer> topscorers) {
        mTopscorers = topscorers;
    }

}

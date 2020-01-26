
package com.wahyu.sportify.model.prediction;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Api {

    @SerializedName("predictions")
    private List<Prediction> mPredictions;
    @SerializedName("results")
    private Long mResults;

    public List<Prediction> getPredictions() {
        return mPredictions;
    }

    public void setPredictions(List<Prediction> predictions) {
        mPredictions = predictions;
    }

    public Long getResults() {
        return mResults;
    }

    public void setResults(Long results) {
        mResults = results;
    }

}

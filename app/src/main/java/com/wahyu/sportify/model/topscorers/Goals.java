
package com.wahyu.sportify.model.topscorers;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Goals {

    @SerializedName("assists")
    private Long mAssists;
    @SerializedName("conceded")
    private Object mConceded;
    @SerializedName("total")
    private Long mTotal;

    public Long getAssists() {
        return mAssists;
    }

    public void setAssists(Long assists) {
        mAssists = assists;
    }

    public Object getConceded() {
        return mConceded;
    }

    public void setConceded(Object conceded) {
        mConceded = conceded;
    }

    public Long getTotal() {
        return mTotal;
    }

    public void setTotal(Long total) {
        mTotal = total;
    }

}

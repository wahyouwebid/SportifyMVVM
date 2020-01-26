
package com.wahyu.sportify.model.topscorers;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Shots {

    @SerializedName("on")
    private Long mOn;
    @SerializedName("total")
    private Long mTotal;

    public Long getOn() {
        return mOn;
    }

    public void setOn(Long on) {
        mOn = on;
    }

    public Long getTotal() {
        return mTotal;
    }

    public void setTotal(Long total) {
        mTotal = total;
    }

}

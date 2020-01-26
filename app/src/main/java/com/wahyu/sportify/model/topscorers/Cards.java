
package com.wahyu.sportify.model.topscorers;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Cards {

    @SerializedName("red")
    private Long mRed;
    @SerializedName("second_yellow")
    private Long mSecondYellow;
    @SerializedName("yellow")
    private Long mYellow;

    public Long getRed() {
        return mRed;
    }

    public void setRed(Long red) {
        mRed = red;
    }

    public Long getSecondYellow() {
        return mSecondYellow;
    }

    public void setSecondYellow(Long secondYellow) {
        mSecondYellow = secondYellow;
    }

    public Long getYellow() {
        return mYellow;
    }

    public void setYellow(Long yellow) {
        mYellow = yellow;
    }

}

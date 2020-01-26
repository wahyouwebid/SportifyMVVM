
package com.wahyu.sportify.model.prediction;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class League {

    @SerializedName("country")
    private String mCountry;
    @SerializedName("flag")
    private String mFlag;
    @SerializedName("logo")
    private String mLogo;
    @SerializedName("name")
    private String mName;

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public String getFlag() {
        return mFlag;
    }

    public void setFlag(String flag) {
        mFlag = flag;
    }

    public String getLogo() {
        return mLogo;
    }

    public void setLogo(String logo) {
        mLogo = logo;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

}

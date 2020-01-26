
package com.wahyu.sportify.model.team;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Team {

    @SerializedName("code")
    private Object mCode;
    @SerializedName("country")
    private String mCountry;
    @SerializedName("founded")
    private Long mFounded;
    @SerializedName("is_national")
    private Boolean mIsNational;
    @SerializedName("logo")
    private String mLogo;
    @SerializedName("name")
    private String mName;
    @SerializedName("team_id")
    private Long mTeamId;
    @SerializedName("venue_address")
    private String mVenueAddress;
    @SerializedName("venue_capacity")
    private Long mVenueCapacity;
    @SerializedName("venue_city")
    private String mVenueCity;
    @SerializedName("venue_name")
    private String mVenueName;
    @SerializedName("venue_surface")
    private String mVenueSurface;

    public Object getCode() {
        return mCode;
    }

    public void setCode(Object code) {
        mCode = code;
    }

    public String getCountry() {
        return mCountry;
    }

    public void setCountry(String country) {
        mCountry = country;
    }

    public Long getFounded() {
        return mFounded;
    }

    public void setFounded(Long founded) {
        mFounded = founded;
    }

    public Boolean getIsNational() {
        return mIsNational;
    }

    public void setIsNational(Boolean isNational) {
        mIsNational = isNational;
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

    public Long getTeamId() {
        return mTeamId;
    }

    public void setTeamId(Long teamId) {
        mTeamId = teamId;
    }

    public String getVenueAddress() {
        return mVenueAddress;
    }

    public void setVenueAddress(String venueAddress) {
        mVenueAddress = venueAddress;
    }

    public Long getVenueCapacity() {
        return mVenueCapacity;
    }

    public void setVenueCapacity(Long venueCapacity) {
        mVenueCapacity = venueCapacity;
    }

    public String getVenueCity() {
        return mVenueCity;
    }

    public void setVenueCity(String venueCity) {
        mVenueCity = venueCity;
    }

    public String getVenueName() {
        return mVenueName;
    }

    public void setVenueName(String venueName) {
        mVenueName = venueName;
    }

    public String getVenueSurface() {
        return mVenueSurface;
    }

    public void setVenueSurface(String venueSurface) {
        mVenueSurface = venueSurface;
    }

}

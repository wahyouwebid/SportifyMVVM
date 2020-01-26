package com.wahyu.sportify.utilities;

/**
 * Created by with love by Ujang Wahyu on 2020-01-07.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */
public class AppConstants {
    public static String BASE_URL = "https://api-football-v1.p.rapidapi.com/v2/";
    public static String API_KEY = "257ff4ad1emsh8379addc8629fe4p14cba4jsnbc35e737d402";
    public static String CREST_API_URL = "https://football-crest-api.herokuapp.com/crest/";
    public static String COVER_IMAGE_URL = "https://loremflickr.com/320/240/";

    public static final String IMAGE_QUALITY_SD = "sd";
    public static final String IMAGE_QUALITY_HD = "hd";

    /**
     * Returns the a url String pointing to an image of the given team's crest
     * @param teamId    id of team
     * @param quality   quality of requested image (IMAGE_QUALITY_SD or IMAGE_QUALITY_HD)
     * @return          url to image
     */

    public String getCrestUrl(long teamId, String quality){
        return CREST_API_URL + quality + "/" + teamId;
    }

    /**
     * Returns a url String to a random image based on a String query
     * @param query    image query
     * @return         url to image
     */
    public static String getCoverImageUrl(String query){
        return COVER_IMAGE_URL+query;
    }

}


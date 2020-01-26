package com.wahyu.sportify.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by with love by Ujang Wahyu on 2020-01-14.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */
public class DateParseUtils {

    //String inputPattern = "yyyy-MM-dd'T'HH:mm:ssZ".substring(0,10);
    //        String outputPattern = "dd MM yyyy";

    public String parse(String dateFromJSON) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
        Date date = null;
        String convertedDate = null;
        try {
            date = dateFormat.parse(dateFromJSON);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy");
            convertedDate = simpleDateFormat.format(date);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return convertedDate;
    }
}

package com.wahyu.sportify.view.adapter.home;

import androidx.cardview.widget.CardView;

/**
 * Created with love by Ujang Wahyu on 2020-01-25.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */
public interface CardAdapter {

    public final int MAX_ELEVATION_FACTOR = 8;

    float getBaseElevation();

    CardView getCardViewAt(int position);

    int getCount();
}
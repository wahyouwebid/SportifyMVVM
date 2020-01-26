package com.wahyu.sportify.base;


/**
 * Created with love by Ujang Wahyu on 2020-01-07.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */
public interface BaseView {

    void onSuccess();

    void onError();

    void showLoading();

    void hideLoading();

    void showMessage(String msg);

}

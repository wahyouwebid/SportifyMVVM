package com.wahyu.sportify.view.fragment.home;

import android.content.Context;
import android.os.Bundle;

import androidx.viewpager.widget.ViewPager;

import android.view.View;

import com.wahyu.sportify.BR;
import com.wahyu.sportify.R;
import com.wahyu.sportify.base.BaseFragment;
import com.wahyu.sportify.base.BaseView;
import com.wahyu.sportify.databinding.FragmentHomeBinding;
import com.wahyu.sportify.model.prediction.Prediction;
import com.wahyu.sportify.utilities.ShadowTransformer;
import com.wahyu.sportify.view.adapter.home.CardFragmentPagerAdapter;
import com.wahyu.sportify.viewmodel.home.HomeView;
import com.wahyu.sportify.viewmodel.home.HomeViewModel;

public class HomeFragment extends BaseFragment<FragmentHomeBinding, HomeViewModel> implements HomeView {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        vm.setNavigator(this);
        vm.loadDataTeam();
        vm.loadDataPrediction();
    }

    @Override
    public int getLayout() {
        return R.layout.fragment_home;
    }

    @Override
    public int getBindingVariable() {
        return com.wahyu.sportify.BR.vmHome;
    }


    @Override
    public void onSuccess() {

    }

    @Override
    public void onError() {

    }

    @Override
    public void showMessage(String msg) {

    }
}

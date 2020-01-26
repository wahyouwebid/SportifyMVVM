package com.wahyu.sportify.view.fragment.standing;

import android.os.Bundle;

import com.wahyu.sportify.BR;
import com.wahyu.sportify.R;
import com.wahyu.sportify.base.BaseFragment;
import com.wahyu.sportify.databinding.FragmentStandingBinding;
import com.wahyu.sportify.viewmodel.standing.StandingView;
import com.wahyu.sportify.viewmodel.standing.StandingViewModel;

/**
 * Created with love by Ujang Wahyu on 2020-01-26.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */
public class StandingFragment extends BaseFragment<FragmentStandingBinding, StandingViewModel> implements StandingView {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle("Standing");
        vm.setNavigator(this);
        vm.loadData();
    }

    @Override
    public int getLayout() {
        return R.layout.fragment_standing;
    }

    @Override
    public int getBindingVariable() {
        return com.wahyu.sportify.BR.vmStanding;
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

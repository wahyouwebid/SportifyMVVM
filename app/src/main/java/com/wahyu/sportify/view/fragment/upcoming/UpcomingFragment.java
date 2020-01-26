package com.wahyu.sportify.view.fragment.upcoming;

import android.os.Bundle;

import com.wahyu.sportify.R;
import com.wahyu.sportify.base.BaseFragment;
import com.wahyu.sportify.databinding.FragmentUpcomingBinding;
import com.wahyu.sportify.viewmodel.upcoming.UpcomingView;
import com.wahyu.sportify.viewmodel.upcoming.UpcomingViewModel;

/**
 * Created with love by Ujang Wahyu on 2020-01-26.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */
public class UpcomingFragment extends BaseFragment<FragmentUpcomingBinding, UpcomingViewModel> implements UpcomingView {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle("Standing");
        vm.setNavigator(this);
        vm.loadData();
    }

    @Override
    public int getLayout() {
        return R.layout.fragment_upcoming;
    }

    @Override
    public int getBindingVariable() {
        return com.wahyu.sportify.BR.vmUpcoming;
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

package com.wahyu.sportify.view.fragment.lastmatch;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;

import com.wahyu.sportify.BR;
import com.wahyu.sportify.R;
import com.wahyu.sportify.base.BaseFragment;
import com.wahyu.sportify.databinding.FragmentLastMatchBinding;
import com.wahyu.sportify.viewmodel.lastmatch.LastMatchView;
import com.wahyu.sportify.viewmodel.lastmatch.LastMatchViewModel;

/**
 * Created with love by Ujang Wahyu on 2020-01-26.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */
public class LastMatchFragment extends BaseFragment<FragmentLastMatchBinding, LastMatchViewModel> implements LastMatchView {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vm.setNavigator(this);
        vm.loadData();
    }

    @Override
    public int getLayout() {

        return R.layout.fragment_last_match;
    }

    @Override
    public int getBindingVariable() {
        initView();
        return com.wahyu.sportify.BR.vmLastMatch;
    }

    private void initView(){
        Toolbar toolbar = view.findViewById(R.id.toolbar);
        toolbar.setTitle("Last Match");
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

package com.wahyu.sportify.base;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.wahyu.sportify.R;
import com.wahyu.sportify.utilities.CommonUtils;
import com.wahyu.sportify.utilities.ShadowTransformer;
import com.wahyu.sportify.view.adapter.home.CardFragmentPagerAdapter;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;

/**
 * Created with love by Ujang Wahyu on 2020-01-07.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */

public abstract class BaseFragment<U extends ViewDataBinding,T extends ViewModel> extends DaggerFragment {

    public Context context;

    public T vm;
    public U dataBinding;
    public View view;

    @Inject
    protected T viewModel;

    @Inject
    ViewModelProvider.Factory viewModelFactory;


    private ProgressDialog mProgressDialog;
    private BaseActivity mActivity;


    public abstract
    @LayoutRes
    int getLayout();


    public abstract int getBindingVariable();

    @Override
    public void onAttach(final Context context) {
        super.onAttach(context);
        if (context instanceof BaseActivity) {
            final BaseActivity activity = (BaseActivity) context;
            this.mActivity = activity;
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getActivity().getApplicationContext();
        vm = (T) ViewModelProviders.of(this, viewModelFactory).get(viewModel.getClass());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        dataBinding = DataBindingUtil.inflate(inflater, getLayout(), container, false);
        view = dataBinding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        dataBinding.setVariable(getBindingVariable(), vm);
        dataBinding.executePendingBindings();
    }

    public void showLoading() {
        hideLoading();
        mProgressDialog = CommonUtils.showLoadingDialog(getActivity());
    }


    public void hideLoading() {
        if (mProgressDialog != null && mProgressDialog.isShowing()) {
            mProgressDialog.cancel();
        }
    }
}

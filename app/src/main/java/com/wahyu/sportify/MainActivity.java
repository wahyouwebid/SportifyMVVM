package com.wahyu.sportify;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.wahyu.sportify.base.BaseActivity;
import com.wahyu.sportify.databinding.ActivityMainBinding;
import com.wahyu.sportify.view.fragment.home.HomeFragment;
import com.wahyu.sportify.view.fragment.lastmatch.LastMatchFragment;
import com.wahyu.sportify.view.fragment.standing.StandingFragment;
import com.wahyu.sportify.view.fragment.topscorers.TopScorersFragment;
import com.wahyu.sportify.view.fragment.upcoming.UpcomingFragment;
import com.wahyu.sportify.viewmodel.home.HomeView;
import com.wahyu.sportify.viewmodel.home.HomeViewModel;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class MainActivity extends BaseActivity<ActivityMainBinding, HomeViewModel> implements HomeView {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        loadFragment(new HomeFragment());
    }


    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    public int getBindingVariable() {
        return BR.vmHome;
    }

    public void initView(){

        MeowBottomNavigation meowBottomNavigation = findViewById(R.id.bottomNavigation);

        meowBottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.ic_home_black_24dp));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.ic_assessment_black_24dp));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.ic_view_week_black_24dp));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(4, R.drawable.ic_date_range_black_24dp));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(5, R.drawable.ic_group_black_24dp));
        meowBottomNavigation.show(1, true);

        meowBottomNavigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                // YOUR CODES
                return null;
            }
        });

        meowBottomNavigation.setOnClickMenuListener(new Function1<MeowBottomNavigation.Model, Unit>() {

            Fragment fragment = null;
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                switch (model.getId()){
                    case 1:
                        fragment = new HomeFragment();
                        break;
                    case 2:
                        fragment = new StandingFragment();
                        break;
                    case 3:
                        fragment = new LastMatchFragment();
                        break;

                    case 4:
                        fragment = new UpcomingFragment();
                        break;

                    case 5:
                        fragment = new TopScorersFragment();
                        break;

                    default:
                        fragment = new HomeFragment();
                        break;
                }

                loadFragment(fragment);
                return Unit.INSTANCE;
            }

        } );
    }

    private void loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();

        }
    }


    @Override
    public void onSuccess() {

    }

    @Override
    public void onError() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(String msg) {

    }
}

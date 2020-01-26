package com.wahyu.sportify.di.modules;
import com.wahyu.sportify.view.fragment.home.HomeFragment;
import com.wahyu.sportify.view.fragment.lastmatch.LastMatchFragment;
import com.wahyu.sportify.view.fragment.standing.StandingFragment;
import com.wahyu.sportify.view.fragment.upcoming.UpcomingFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created with love by Ujang Wahyu on 2020-01-08.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */

@Module
public abstract class FragmentBindingModule {

    @ContributesAndroidInjector
    abstract StandingFragment provideStandingFragment();

    @ContributesAndroidInjector
    abstract LastMatchFragment provideLastMatchFragment();

    @ContributesAndroidInjector
    abstract UpcomingFragment provideUpcomingFragment();

    @ContributesAndroidInjector
    abstract HomeFragment provideHomeFragment();

}

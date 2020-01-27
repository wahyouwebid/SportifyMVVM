package com.wahyu.sportify.di.modules;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.wahyu.sportify.di.ViewModelFactory;
import com.wahyu.sportify.di.ViewModelKey;
import com.wahyu.sportify.viewmodel.home.HomeViewModel;
import com.wahyu.sportify.viewmodel.lastmatch.LastMatchViewModel;
import com.wahyu.sportify.viewmodel.standing.StandingViewModel;
import com.wahyu.sportify.viewmodel.topscorers.TopScorersViewModel;
import com.wahyu.sportify.viewmodel.upcoming.UpcomingViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created with love by Ujang Wahyu on 2020-01-08.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(StandingViewModel.class)
    abstract ViewModel bindStandingViewModel(StandingViewModel standingViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(LastMatchViewModel.class)
    abstract ViewModel bindLastMatchViewModel(LastMatchViewModel lastMatchViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(UpcomingViewModel.class)
    abstract ViewModel bindUpcomingMatch(UpcomingViewModel upcomingViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel.class)
    abstract ViewModel bindHomeViewModel(HomeViewModel homeViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(TopScorersViewModel.class)
    abstract ViewModel bindTopScorersViewModel(TopScorersViewModel topScorersViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindFactory(ViewModelFactory factory);
}

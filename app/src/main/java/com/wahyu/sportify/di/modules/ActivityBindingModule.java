package com.wahyu.sportify.di.modules;
import com.wahyu.sportify.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created with love by Ujang Wahyu on 2020-01-08.
 * Email : ujangwahyusst@gmail.com
 * Linkedin : linkedin.com/in/ujangwahyu
 */

@Module
public abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = {FragmentBindingModule.class})
    abstract MainActivity bindMainActivity();

//    @ContributesAndroidInjector(modules = {})
//    abstract DetailTeamActivity bindDetailActivity();
}

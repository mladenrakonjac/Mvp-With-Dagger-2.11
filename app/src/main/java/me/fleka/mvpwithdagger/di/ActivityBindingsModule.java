package me.fleka.mvpwithdagger.di;

import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;
import me.fleka.mvpwithdagger.di.main.MainActivity;
import me.fleka.mvpwithdagger.di.main.MainActivityModule;
import me.fleka.mvpwithdagger.di.scopes.PerActivity;

/**
 * Created by Mladen Rakonjac on 8/19/17.
 */

@Module(includes = AndroidInjectionModule.class)
abstract class ActivityBindingsModule {
    @PerActivity
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity mainActivityInjector();

}


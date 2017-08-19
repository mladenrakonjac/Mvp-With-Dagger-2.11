package me.fleka.mvpwithdagger.di.main;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Mladen Rakonjac on 8/19/17.
 */

@Module
public abstract class MainActivityModule {
    @Binds
    public abstract MainContract.View view(MainActivity mainActivity);

    @Provides
    static MainContract.Presenter  provideAuthPresenter(MainContract.View view) {

        return new PresenterImpl(view);
    }
}

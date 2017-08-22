package me.fleka.mvpwithdagger.di.main;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import me.fleka.mvpwithdagger.ui.main.MainActivity;
import me.fleka.mvpwithdagger.ui.main.MainContract;
import me.fleka.mvpwithdagger.ui.main.PresenterImpl;

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

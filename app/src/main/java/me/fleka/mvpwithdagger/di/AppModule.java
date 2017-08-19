package me.fleka.mvpwithdagger.di;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

/**
 * Created by Mladen Rakonjac on 8/19/17.
 */

@Module
public abstract class AppModule {

    // same as provides but this returns injected parameter
    @Binds
    abstract Context bindContext(Application application);

}

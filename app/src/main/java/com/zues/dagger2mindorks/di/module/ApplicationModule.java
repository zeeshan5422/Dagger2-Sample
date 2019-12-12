package com.zues.dagger2mindorks.di.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.zues.dagger2mindorks.di.ApplicationContext;
import com.zues.dagger2mindorks.di.DatabaseInfo;

import dagger.Module;
import dagger.Provides;

/* ---  Created by akhtarz on 12/12/2019. ---*/
@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application app) {
        mApplication = app;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return "demo-dagger.db";
    }

    @Provides
    @DatabaseInfo
    Integer provideDatabaseVersion() {
        return 2;
    }

    @Provides
    SharedPreferences provideSharedPrefs() {
        return mApplication.getSharedPreferences("demo-prefs", Context.MODE_PRIVATE);
    }
}

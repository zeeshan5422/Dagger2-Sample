package com.zues.dagger2mindorks.di.module;

import android.app.Activity;
import android.content.Context;

import com.zues.dagger2mindorks.di.ActivityContext;

import dagger.Module;
import dagger.Provides;

/* ---  Created by akhtarz on 12/12/2019. ---*/
@Module
public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    Activity provideActivity() {
        return mActivity;
    }
}

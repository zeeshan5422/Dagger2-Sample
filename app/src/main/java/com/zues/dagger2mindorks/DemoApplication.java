package com.zues.dagger2mindorks;

import android.app.Application;
import android.content.Context;

import com.zues.dagger2mindorks.data.DataManager;
import com.zues.dagger2mindorks.di.component.ApplicationComponent;
import com.zues.dagger2mindorks.di.component.DaggerApplicationComponent;
import com.zues.dagger2mindorks.di.module.ApplicationModule;

import javax.inject.Inject;

/* ---  Created by akhtarz on 12/12/2019. ---*/
public class DemoApplication extends Application {

    protected ApplicationComponent applicationComponent;

    @Inject
    DataManager dataManager;

    public static DemoApplication get(Context context) {
        return (DemoApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        buildComponent();
    }

    private void buildComponent() {
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }
}

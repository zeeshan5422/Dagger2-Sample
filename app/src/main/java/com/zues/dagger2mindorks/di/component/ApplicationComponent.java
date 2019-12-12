package com.zues.dagger2mindorks.di.component;

import android.app.Application;

import com.zues.dagger2mindorks.DemoApplication;
import com.zues.dagger2mindorks.data.DataManager;
import com.zues.dagger2mindorks.data.DbHelper;
import com.zues.dagger2mindorks.data.SharedPrefsHelper;
import com.zues.dagger2mindorks.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/* ---  Created by akhtarz on 12/12/2019. ---*/
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication demoApplication);

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();

}

/* NOTE
 When the dependencies are provided through field injection i.e. @inject on the member variables,
 we have to tell the Dagger to scan this class through the implementation of this interface.
*/

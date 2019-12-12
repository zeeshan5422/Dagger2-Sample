package com.zues.dagger2mindorks.di.component;

import com.zues.dagger2mindorks.MainActivity;
import com.zues.dagger2mindorks.di.PerActivity;
import com.zues.dagger2mindorks.di.module.ActivityModule;

import dagger.Component;

/* ---  Created by akhtarz on 12/12/2019. ---*/
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);

}

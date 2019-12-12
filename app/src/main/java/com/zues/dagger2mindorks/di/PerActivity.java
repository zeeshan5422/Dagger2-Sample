package com.zues.dagger2mindorks.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;
import javax.inject.Scope;

/* ---  Created by akhtarz on 12/12/2019. ---*/
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}

package com.zues.dagger2mindorks.data;

import android.content.Context;
import android.content.res.Resources;

import com.zues.dagger2mindorks.data.models.User;
import com.zues.dagger2mindorks.di.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

/* ---  Created by akhtarz on 12/12/2019. ---*/
@Singleton
public class DataManager {

    private Context mContext;
    private DbHelper mDbHelper;
    private SharedPrefsHelper mSharedPrefsHelper;

    @Inject
    public DataManager(@ApplicationContext Context context,
                       DbHelper dbHelper,
                       SharedPrefsHelper sharedPrefsHelper) {
        mContext = context;
        mDbHelper = dbHelper;
        mSharedPrefsHelper = sharedPrefsHelper;
    }

    public void saveAccessToken(String accessToken) {
        mSharedPrefsHelper.put(SharedPrefsHelper.PREF_KEY_ACCESS_TOKEN, accessToken);
    }

    public String getAccessToken(){
        return mSharedPrefsHelper.get(SharedPrefsHelper.PREF_KEY_ACCESS_TOKEN, null);
    }

    public Long createUser(User user) throws Exception {
        return mDbHelper.insertUser(user);
    }

    public User getUser(Long userId) throws Resources.NotFoundException, NullPointerException {
        return mDbHelper.getUser(userId);
    } // This demo application uses Dagger2 for dependency injection, and store in shared prefs and in Sqlite database
}

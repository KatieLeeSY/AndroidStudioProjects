package com.appplepi.firstproject;

import android.app.Application;

import com.tsengvn.typekit.Typekit;

/**
 * Created by XNOTE on 2016-08-30.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Typekit.getInstance()
                .addNormal(Typekit.createFromAsset(this, "fonts/InterparkGothicBold.ttf"));

    }
}

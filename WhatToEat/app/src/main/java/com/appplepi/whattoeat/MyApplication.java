package com.appplepi.whattoeat;

import android.app.Application;

import com.tsengvn.typekit.Typekit;

/**
 * Created by XNOTE on 2016-08-31.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Typekit.getInstance()
                .addNormal(Typekit.createFromAsset(this, "fonts/BMDOHYEON_ttf.ttf"));

    }
}
package com.example.android.tourapp;

import android.app.Application;
import android.content.Context;

/**
 * Created by clarissajarem on 8/15/18.
 * credit to Matthew Bailey for code snippet
 */

public class App extends Application {
    private static Context appContext;

    public static Context getContext() {
        return appContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = this;
    }

}

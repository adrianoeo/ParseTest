package com.aeo.parsetest;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by adriano on 10/12/2015.
 */
public class ParseTestApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "hHp9ItjzJZlfYYl2GGTjYNEeNTjTnQeE8vQIz1K3", "fIEOfdCgU9e16kYrGUmrCV0K5lKf983pCyUpNc7I");

    }
}



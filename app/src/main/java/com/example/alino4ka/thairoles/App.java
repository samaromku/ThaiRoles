package com.example.alino4ka.thairoles;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by andrey on 08.07.2017.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initRealm();

    }

    private void initRealm() {
        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder().build();
        config.shouldDeleteRealmIfMigrationNeeded();
        Realm.setDefaultConfiguration(config);
    }
}

package com.example.applicationjoseph;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by josep on 09/07/2017.
 */

public class Configuracao extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        RealmConfiguration config = new RealmConfiguration.Builder(this)
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(config); }
}

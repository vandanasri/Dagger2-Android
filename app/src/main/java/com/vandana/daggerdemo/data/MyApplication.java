package com.vandana.daggerdemo.data;

import android.app.Application;

import com.vandana.daggerdemo.data.component.ApplicationComponent;
import com.vandana.daggerdemo.data.component.DaggerApplicationComponent;
import com.vandana.daggerdemo.data.module.ApplicationModule;
import com.vandana.daggerdemo.data.remote.NetworkService;


import javax.inject.Inject;
import javax.security.auth.Subject;

public class MyApplication extends Application {
    public ApplicationComponent applicationComponent;



   @Inject
   NetworkService networkService;


    @Override
    public void onCreate() {
        super.onCreate();
        getDependencies();
    }

    public void getDependencies() {

        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);

    }

}

package com.vandana.daggerdemo.data.component;

import android.content.Context;

import com.vandana.daggerdemo.data.MyApplication;
import com.vandana.daggerdemo.data.module.ApplicationModule;
import com.vandana.daggerdemo.data.qualifiers.AppContextQualifier;
import com.vandana.daggerdemo.data.remote.NetworkService;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {


void inject(MyApplication application);

@AppContextQualifier
Context getAppContext();

NetworkService getNetworkService();


}

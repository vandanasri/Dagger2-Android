package com.vandana.daggerdemo.data.module;

import android.content.Context;

import com.vandana.daggerdemo.data.MyApplication;
import com.vandana.daggerdemo.data.qualifiers.AppContextQualifier;
import com.vandana.daggerdemo.data.qualifiers.DatabaseQualifier;
import com.vandana.daggerdemo.data.qualifiers.NetworkQualifier;


import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

private MyApplication application;

public ApplicationModule(MyApplication application){

    this.application =application;
}


    @Provides
@AppContextQualifier
Context provideContext(){return application;}

    @Provides
@DatabaseQualifier
String provideDatabaseName(){ return "dbName";}

    @Provides
@NetworkQualifier
String provideNetworkKey(){ return "dbName";}

    @Provides
@DatabaseQualifier
Integer provideDataBaseVersion(){ return 1;}


}

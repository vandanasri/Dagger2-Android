package com.vandana.daggerdemo.data.module;

import android.content.Context;
import com.vandana.daggerdemo.data.qualifiers.ActivityContextQualifier;
import com.vandana.daggerdemo.data.ui.MainActivity;


import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    MainActivity activity;


    public ActivityModule(MainActivity activity){
        this.activity = activity;
    }

    @ActivityContextQualifier
    @Provides
    Context provideActivityContext(){return activity;}
}

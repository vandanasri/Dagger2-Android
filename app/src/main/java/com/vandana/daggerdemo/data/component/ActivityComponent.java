package com.vandana.daggerdemo.data.component;

import com.vandana.daggerdemo.data.Scope.AcitvityScope;
import com.vandana.daggerdemo.data.module.ActivityModule;
import com.vandana.daggerdemo.data.ui.MainActivity;

import dagger.Component;

@AcitvityScope
@Component(dependencies = {ApplicationComponent.class}, modules = {ActivityModule.class})
public interface ActivityComponent {

     void inject(MainActivity activity);
}

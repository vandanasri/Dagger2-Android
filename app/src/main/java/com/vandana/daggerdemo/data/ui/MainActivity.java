package com.vandana.daggerdemo.data.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vandana.daggerdemo.R;
import com.vandana.daggerdemo.data.MyApplication;
import com.vandana.daggerdemo.data.component.DaggerActivityComponent;
import com.vandana.daggerdemo.data.module.ActivityModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    ViewModel viewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getAcivityComponent();


    }

    void getAcivityComponent(){

       DaggerActivityComponent.builder()
                .applicationComponent(((MyApplication) getApplication()).applicationComponent)
                .activityModule(new ActivityModule(this))
                .build()
                .inject(this);
    }
}

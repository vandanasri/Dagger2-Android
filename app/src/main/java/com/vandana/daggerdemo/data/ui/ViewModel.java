package com.vandana.daggerdemo.data.ui;

import com.vandana.daggerdemo.data.Scope.AcitvityScope;
import com.vandana.daggerdemo.data.remote.NetworkService;

import javax.inject.Inject;

@AcitvityScope
public class ViewModel {

    private NetworkService networkService;

    @Inject
    public ViewModel(NetworkService networkService) {
        this.networkService = networkService;
    }

    public String getSomeData() {
        return networkService.getDummyData();
    }
}

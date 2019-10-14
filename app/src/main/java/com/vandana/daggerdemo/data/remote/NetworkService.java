package com.vandana.daggerdemo.data.remote;

import android.content.Context;

import com.vandana.daggerdemo.data.qualifiers.AppContextQualifier;
import com.vandana.daggerdemo.data.qualifiers.NetworkQualifier;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class NetworkService {

    private Context context;
    private String apiKey;

    @Inject
    public NetworkService(@AppContextQualifier Context context, @NetworkQualifier String apiKey) {
        // do the initialisation here
        this.context = context;
        this.apiKey = apiKey;
    }

    public String getDummyData() {
        return "NETWORK_DUMMY_DATA";
    }
}

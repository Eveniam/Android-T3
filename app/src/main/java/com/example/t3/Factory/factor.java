package com.example.t3.Factory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class factor {
    public static Retrofit Links(){
        return new Retrofit.Builder()
                .baseUrl("https://62989a54de3d7eea3c6bac15.mockapi.io/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}

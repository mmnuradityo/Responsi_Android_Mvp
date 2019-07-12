package com.responsi.mvp.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiService {

    public static final String BASE_API_URL = "https://private-0e6b9-ganjarwidiatmansyah.apiary-mock.com/";

    public void getNetwork(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}

package com.responsi.mvp.api;

import com.responsi.mvp.model.People;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PeopleService {


    @GET("people")
    Call<People> getData(@Query("results") String result,
                               @Query("nat") String nat);
}

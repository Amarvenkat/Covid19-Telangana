package com.amar.covid19telangana.ApiInterface;

import com.amar.covid19telangana.RetrofitClass.Covid19Resources;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiResources {

    @GET("resources/resources.json")
    Call<Covid19Resources> getResourse();
}

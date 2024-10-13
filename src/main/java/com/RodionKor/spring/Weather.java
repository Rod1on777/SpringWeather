package com.RodionKor.spring;

import com.RodionKor.spring.DTO.CurrentResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Weather {

    @GET("/v1/current.json")
    Call<CurrentResponse> current(@Query("key") String key, @Query("q") String location);
}

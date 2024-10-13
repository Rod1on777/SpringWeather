package com.RodionKor.spring;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

public class JsonPlaceholderService {

    private Retrofit retrofit;
    private static JsonPlaceholderService instance;
    private static final String BASE_URL = "https://api.weatherapi.com";
    private static final String KEY = "b9ada80041884ef8b6762943241010";



    private static Weather init(){
        Gson gson = new GsonBuilder().setLenient().create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        return retrofit.create(Weather.class);
    }

    public static JsonPlaceholderService instance(){
        if(instance == null){
            instance = new JsonPlaceholderService();
        }
        return instance;
    }
}

package com.RodionKor.spring;

import com.RodionKor.spring.DTO.CurrentResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {

    private static List<Double> weatherInCity = new ArrayList<Double>();

    public static void fillWeather(){
        CurrentResponse currentResponse = new CurrentResponse();
        weatherInCity.add(currentResponse.getCurrent().getWind_degree());
        weatherInCity.add(currentResponse.getCurrent().getFeelslike_c());
        weatherInCity.add(currentResponse.getCurrent().getHumidity());
    }

    public static List<Double> all(){
        fillWeather();
        return weatherInCity;
    }


}

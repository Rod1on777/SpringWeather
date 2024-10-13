package com.RodionKor.spring;


import com.RodionKor.spring.DTO.CurrentResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.autoconfigure.batch.BatchTransactionManager;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.*;

import java.util.Currency;
import java.util.List;

@RestController
public class WeatherApiController {

    @GetMapping("/api/v1/weather-in-city")
    public CurrentResponse weatherInCity(@RequestParam String query, HttpRequestHandler httpRequestHandler){
        String q = query;
        if(q==null){
            q = request.;
        }
    }
}

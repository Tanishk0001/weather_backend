package com.tanishk.weather.Backend.controller;

import com.tanishk.weather.Backend.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:3000", "http://192.168.56.1:3000"})
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public Map<String, Object> getWeather(@RequestParam String city) {
        return weatherService.getWeatherByCity(city);
    }
}

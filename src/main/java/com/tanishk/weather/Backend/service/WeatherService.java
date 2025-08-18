package com.tanishk.weather.Backend.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    private final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather";

    public Map<String, Object> getWeatherByCity(String city) {
        String url = BASE_URL + "?q=" + city + "&appid=" + apiKey + "&units=metric";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, Map.class);
    }
}

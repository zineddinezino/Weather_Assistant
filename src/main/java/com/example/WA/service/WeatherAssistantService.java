package com.example.WA.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@AllArgsConstructor
@Slf4j
public class WeatherAssistantService {

    public String getWeatherPrediction(String location, Date date){
        var weather = "";
        return switch (weather) {
            case ("Rainy") -> "Take your umbrella";
            case ("Sunny") -> "It will be worm today";
            case ("Windy") -> "Don't forget your jacket";
            case ("Stormy") -> "You better stay home";
            default -> throw new IllegalStateException("Unexpected value: " + weather);
        };
    }
}

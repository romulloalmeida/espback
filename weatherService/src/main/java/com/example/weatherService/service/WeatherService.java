package com.example.weatherService.service;

import org.springframework.stereotype.Service;

@Service
public interface WeatherService {
    Integer getTemperature(String city,String country);
}

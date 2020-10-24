package com.weather.application;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Scanner;

public class LocationController {

    ObjectMapper objectMapper = new ObjectMapper();
    LocationService locationService = new LocationService();


    public String saveNewLocation(String cityName, String longitude, String latitude, String region, String country) {
        Location location = locationService.addNewLocation(cityName, longitude, latitude, region, country);
        return location.toString();
        // todo map (translate) a Location object to String by using objectMapper
    }
}

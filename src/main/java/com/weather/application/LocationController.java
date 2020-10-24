package com.weather.application;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Scanner;

public class LocationController {

    ObjectMapper objectMapper = new ObjectMapper();
    LocationService locationService = new LocationService();


    public String saveNewLocation(String cityName, String longitude, String latitude, String region, String country) {
        Location location = locationService.addNewLocation(cityName, longitude, latitude, region, country);
        return location.toString();

        // todo use LocationService to pass a data and receive a domain object eg. Location
        // todo map (translate) a Weather object to String by using objectMapper

    }
}

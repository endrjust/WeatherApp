package com.weather.application;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class LocationController {


    ObjectMapper objectMapper = new ObjectMapper();
    LocationService locationService = new LocationService();


    public String saveNewLocation(String cityName, String longitude, String latitude, String region, String country) {
        Location location = locationService.addNewLocation(cityName, longitude, latitude, region, country);
        try {
            return objectMapper.writeValueAsString(location);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("...");
        }
    }

    public String showAllLocations() {
        List<Location> locations = locationService.readAllLocations();

        try {
            return objectMapper.writeValueAsString(locations);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("...");
        }
    }

}

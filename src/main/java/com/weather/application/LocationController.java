package com.weather.application;

import com.fasterxml.jackson.databind.ObjectMapper;

public class LocationController {

    ObjectMapper objectMapper = new ObjectMapper();
    LocationService locationService = new LocationService();

    public String saveNewLocation(String cityName, String country) {
        // todo use LocationService to pass a data and receive a domain object eg. Location
        // todo map (translate) a Weather object to String by using objectMapper

        return "response";
    }
}

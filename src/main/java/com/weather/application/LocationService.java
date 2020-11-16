package com.weather.application;

import java.util.List;

public class LocationService {

    LocationRepository locationRepository = new LocationRepository();

    public Location addNewLocation(String cityName, String longitude, String latitude, String region, String country) {
        if (cityName == null || cityName.isBlank()) {
            throw new BadRequestException("Nazwa miasta nie moze byc pusta");
        }
        if (Double.parseDouble(longitude) > 90 || Double.parseDouble(longitude) < -90 ) {
            throw new BadRequestException("Szerokosc geogr. musi zawierac sie pomiedzy -90S a 90N");
        }
        if (Double.parseDouble(latitude) > 180 || Double.parseDouble(latitude) < -180 ) {
            throw new BadRequestException("Szerokosc geogr. musi zawierac sie pomiedzy -180W a 180E");
        }
//        if (region == null || region.isEmpty()) {
//            throw new BadRequestException("Nazwa regionu nie moze byc pusta");
//        }
        if (country == null || country.isBlank()) {
            throw new BadRequestException("Nazwa panstwa nie moze byc pusta");
        }

        Location location = new Location(cityName, Double.parseDouble(longitude), Double.parseDouble(latitude), region, country);
        return locationRepository.saveNewEntry(location);
k
        // todo create new method
        // todo valid (check values) a input data
        // todo create a new Location object
        // todo if object is valid then save to database by using LocationRepository
        // todo return the Location object
    }

    public List<Location> readAllLocations() {
        return locationRepository.readAllLocations();
    }
}

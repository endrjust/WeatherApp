package com.weather.application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocationServiceTest {

    LocationService locationService = new LocationService();

    @Test
    void addNewLocation_shouldReturnNewLocation() {
        // when
        Location result = locationService.addNewLocation("city", "10", "20", "region", "country");

        // then
        assertNotNull(result.getId());
        assertEquals(result.getCity(), "city");
        assertEquals(result.getCountry(), "country");
        assertEquals(result.getLongitude(), 10);
        assertEquals(result.getLatitude(), 20);
        assertEquals(result.getRegion(), "region");
    }

    @Test
    void addNewLocation_whenRegionIsEmpty_shouldReturnNewLocation() {
        // when
        Location result = locationService.addNewLocation("city", "10", "20", "", "country");

        // then
        assertNotNull(result.getId());
        assertEquals(result.getCity(), "city");
        assertEquals(result.getCountry(), "country");
        assertEquals(result.getLongitude(), 10);
        assertEquals(result.getLatitude(), 20);
        assertEquals(result.getRegion(), "");
    }

    @Test
    void addNewLocation_whenCityIsEmpty_shouldTrowException() {
        // when
        assertThrows(Exception.class, () -> locationService.addNewLocation(" ", "10", "20", "region", "country"));
    }

    @Test
    void addNewLocation_whenCountryIsEmpty_shouldTrowException() {
        // when
        assertThrows(Exception.class, () -> locationService.addNewLocation("city", "10", "20", "region", " "));
    }

    @Test
    void addNewLocationWhenLongitudeIsAbove180_ShouldThrowException() {
        assertThrows(Exception.class, () -> locationService.addNewLocation("city", "181", "20", "region", "PL"));
    }

    @Test
    void addNewLocationWhenLongitudeIsString_ShouldThrowException() {
        assertThrows(Exception.class, () -> locationService.addNewLocation("city", "asd", "20", "region", "PL"));
    }
}
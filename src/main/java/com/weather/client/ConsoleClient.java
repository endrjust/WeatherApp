package com.weather.client;

import com.weather.application.LocationController;

public class ConsoleClient {

    LocationController locationController = new LocationController();

    public void runUserInterface() {
        System.out.println("Wybierz co chcesz zrobić: ");

        String cityName = "London";
        String country = "UK";

        String response = locationController.saveNewLocation(cityName, country);

        System.out.println("Wynik operacji: " + response);
    }
}

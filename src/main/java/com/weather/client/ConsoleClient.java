package com.weather.client;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.weather.application.Location;
import com.weather.application.LocationController;

import java.util.Scanner;

public class ConsoleClient {

    LocationController locationController = new LocationController();


    public void runUserInterface() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz co chcesz zrobić: ");
        System.out.println("1 - Dodaj lokalizację");
        System.out.println("2 - Wyswietl dostępne lokalizacje");
        System.out.println("3 - Pobierz wartosci pogodowe");
        int userIn = scanner.nextInt();
        switch (userIn) {
            case 1:
                System.out.println("Wybrales opcje 1");
                break;
            case 2:
                System.out.println("Wybrales opcje 2");
                break;
            case 3:
                System.out.println("Wybrales opcje 3");
                break;
            default:
                System.out.println("Nie wybrales poprawnej opcji");
                break;
        }
        String cityName = "London";
        String longitude = "51.5";
        String latitude = "-0.11";
        String country = "UK";
        String region = null;

        String response = locationController.saveNewLocation(cityName, longitude, latitude, region, country);

        System.out.println("Wynik operacji: " + response);
    }
}

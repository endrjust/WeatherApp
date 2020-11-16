package com.weather.client;

import com.weather.application.LocationController;

import java.util.Scanner;

public class ConsoleClient {

    LocationController locationController = new LocationController();


    public void runUserInterface() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Wybierz co chcesz zrobić: ");
            System.out.println("1 - Dodaj lokalizację");
            System.out.println("2 - Wyswietl dostępne lokalizacje");
            System.out.println("3 - Pobierz wartosci pogodowe");
            System.out.println("0 - Zakoncz program");
            int userIn = scanner.nextInt();
            switch (userIn) {
                case 1:
                    System.out.println("Wybrales opcje dodania nowej lokalizacji:");
                    scanner.nextLine();
                    System.out.println("Podaj nazwię miasta: ");
                    String tempCity = scanner.nextLine();
                    System.out.println("Podaj dlugosc geograficzną");
                    String tempLongitude = scanner.nextLine();
                    System.out.println("Podaj dlugosc geograficzną");
                    String tempLatitude = scanner.nextLine();
                    System.out.println("Podaj region: ");
                    String tempRegion = scanner.nextLine();
                    System.out.println("Podaj państwo");
                    String tempCountry = scanner.nextLine();
                    String respone = locationController.saveNewLocation(tempCity, tempLongitude, tempLatitude, tempRegion, tempCountry);
                    System.out.println("Wynik operacji: " + respone);
                    break;
                case 2:
                    locationController.showAllLocations();
                    break;
                case 3:
                    System.out.println("Wybrales opcje 3");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Nie wybrales poprawnej opcji");
                    break;
            }
        }
    }
}

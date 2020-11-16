package com.weather.application;

import org.junit.jupiter.api.Test;

public class WeatherForecastClientTest {

    private final WeatherForecastClient weatherForecastClient = new WeatherForecastClient();

    @Test
    void test() {
        String result = weatherForecastClient.getWeather("London");
        System.out.println(result);
    }
}

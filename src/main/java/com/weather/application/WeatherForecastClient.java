package com.weather.application;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherForecastClient {

    private final HttpClient httpClient = HttpClient.newHttpClient();
    private final ObjectMapper objectMapper = new ObjectMapper();

    public WeatherForecastClient() {
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.findAndRegisterModules();
    }


    public String getWeather(String cityName) {
        String format = String.format("https://weatherapi-com.p.rapidapi.com/forecast.json?q=%s&days=3", cityName);
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create(format))
                .header("x-rapidapi-key", "e6a1308ca1msh40189dd2f865a80p1bc6bfjsncc436dd97185")
                .header("x-rapidapi-host", "weatherapi-com.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        try {

            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            String weatherResponse = httpResponse.body();

            return weatherResponse;
        } catch (Exception e) {
            System.out.println("Nieudana próba połączenia: " + e.getMessage());
            throw new RuntimeException("...");
        }
    }
}

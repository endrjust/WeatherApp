package com.weather;

import com.weather.client.ConsoleClient;

public class ApplicationRunner {

    public static void main(String[] args) {
        ConsoleClient consoleClient = new ConsoleClient();
        consoleClient.runUserInterface();
    }
}

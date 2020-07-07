package com.bikerental;

import com.bikerental.bike.BikeBase;
import com.bikerental.client.Client;

import java.util.Scanner;

public interface Printer {
    void printWelcomeMessage(Client client, Scanner scanner);
    void printListOfAllBikes(BikeBase bikeBase);
    void printListOfClientBikes(Client client);
    void printMenu();
    void printCaseOne();
    void printCaseTwo();
    void printCaseThree();
    void filterByColor();
    void filterByBrand();
    void filterByPrice();
    void filterByAvailability();
}

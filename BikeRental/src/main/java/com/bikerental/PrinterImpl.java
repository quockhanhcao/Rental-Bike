package com.bikerental;

import com.bikerental.bike.BikeBase;
import com.bikerental.client.Client;

import java.util.Scanner;

public class PrinterImpl implements Printer {

    public void printWelcomeMessage(Client client, Scanner scanner) {
        System.out.println("WELCOME IN OUR BIKE RENTAL!\n");
        client.getWallet().setMoney(200);
       /* System.out.println("How much money do you have?");
        System.out.print("Set amount: ");
        client.getWallet().setMoney(scanner.nextInt());*/

        //clear list of bike at start of the program
        client.getBikeBase().getListOfBike().clear();
    }

    public void printListOfAllBikes(BikeBase bikeBase) {
        System.out.println("List of the bikes: ");
        for (int i = 0; i < bikeBase.getListOfBike().size(); i++) {
            System.out.println("Number " + (i + 1) + " " + bikeBase.getListOfBike().get(i));
        }
        System.out.println("");
    }

    public void printListOfClientBikes(Client client) {
        System.out.println("List of your bikes: ");
        for (int i = 0; i < client.getBikeBase().getListOfBike().size(); i++) {
            System.out.println("Number " + (i + 1) + " " + client.getBikeBase().getListOfBike().get(i));
        }
        System.out.println("");
    }

    public void printMenu() {
        System.out.print("Menu:\n" +
                "1. Show list of all bikes\n" +
                "2. Show list of your rented bikes \n" +
                "3. Check your wallet and transfer money\n" +
                "4. Exit\n" +
                "Select option: ");
    }

    public void printCaseOne() {
        System.out.print("Menu:\n" +
                "1. Rent a bike\n" +
                "2. Filter list \n" +
                "0. Back to menu\n" +
                "Select option: ");
    }
    public void printCaseTwo() {
        System.out.print("Menu:\n" +
                "1. Return the bike\n" +
                "0. Back to menu\n" +
                "Select option: ");
    }

    public void printCaseThree() {
        System.out.print("Menu:\n" +
                "1. Transfer money\n" +
                "0. Back to menu\n" +
                "Select option: ");
    }


    public void filterByColor() {
        System.out.print("Filter by:\n" +
                "1. RED\n" +
                "2. BLUE\n" +
                "3. BLACK\n" +
                "0. Back to menu\n" +
                "Select: ");
    }

    public void filterByBrand() {
        System.out.print("Filter by:\n" +
                "1. SCOTT\n" +
                "2. GIANT\n" +
                "3. TREK\n" +
                "0. Back to menu\n" +
                "Select: ");
    }


    public void filterByPrice() {
        System.out.print("Filter by:\n" +
                "1. TEN\n" +
                "2. FIFTEEN\n" +
                "3. TWENTY\n" +
                "0. Back to menu\n" +
                "Select: ");
    }

    public void filterByAvailability() {
        System.out.print("Filter by:\n" +
                "1. FREE\n" +
                "2. BOOKED\n" +
                "0. Back to menu\n" +
                "Select: ");
    }
}

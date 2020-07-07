package com.bikerental;

import com.bikerental.bike.BikeBase;
import com.bikerental.client.Client;
import com.bikerental.services.Filters;
import com.bikerental.services.Rental;

import java.util.Scanner;

public class Runner {
    private Scanner scanner = new Scanner(System.in);
    private Client client = new Client();
    private Printer printerImpl = new PrinterImpl();
    private BikeBase bikeBase = new BikeBase();
    private Filters filters = new Filters();
    private Rental rental = new Rental();

    public void run() {
        printerImpl.printWelcomeMessage(client, scanner);
        runMenu();
    }

    private void runMenu() {

        printerImpl.printMenu();

        int option = scanner.nextInt();
        switch (option) {
            case 1:
                setCaseOne();
                break;
            case 2:
                setCaseTwo();
                break;
            case 3:
                setCaseThree();
                break;
            case 4:
                setCaseFour();
                break;
        }
    }

    private void setCaseOne() {
        printerImpl.printListOfAllBikes(bikeBase);
        printerImpl.printCaseOne();
        int option = scanner.nextInt();
        if (option == 1) {
            rental.rentBike(client, bikeBase, scanner);
            runMenu();
        } else if (option == 2) {
            //TODO
            BikeBase filterBikeBase = filters.filterList(bikeBase, scanner);
            printerImpl.printListOfAllBikes(filterBikeBase);
            rental.rentBike(client, bikeBase, scanner);
            runMenu();
        } else if (option == 0) {
            runMenu();
        }
    }

    private void setCaseTwo() {
        printerImpl.printListOfClientBikes(client);
        printerImpl.printCaseTwo();
        int option = scanner.nextInt();
        if (option == 1) {
            rental.returnBike(client, scanner);
            runMenu();
        } else if (option == 0) {
            runMenu();
        }
    }

    private void setCaseThree() {
        System.out.println("Now you have $" + client.getWallet().getMoney());
        printerImpl.printCaseThree();
        int walletOption = scanner.nextInt();
        if (walletOption == 1) {
            client.getWallet().transferMoney(scanner);
            System.out.println("Now you have $" + client.getWallet().getMoney());
            runMenu();
        } else if (walletOption == 0) {
            runMenu();
        }
    }

    private boolean setCaseFour() {
        if (!client.getBikeBase().getListOfBike().isEmpty()) {
            System.out.println("You haven't turn bike yet!");
            runMenu();
            return true;
        } else if (client.getWallet().getMoney() < 0) {
            System.out.println("You haven't enough money to leave! Please transfer money to your wallet");
            runMenu();
            return true;
        } else {
            System.out.println("Goodbye!");
            return false;
        }
    }

}

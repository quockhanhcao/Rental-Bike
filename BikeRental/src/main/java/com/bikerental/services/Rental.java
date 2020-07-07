package com.bikerental.services;

import com.bikerental.bike.Availability;
import com.bikerental.bike.Bike;
import com.bikerental.bike.BikeBase;
import com.bikerental.client.Client;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Rental {
    private Map<Bike, Long> timeOfRenting = new HashMap<>();

    public void rentBike(Client client, BikeBase bikeBase, Scanner scanner) {
        System.out.print("Number of bike: ");
        int rentNumber = scanner.nextInt() - 1;
        Bike bike = bikeBase.getListOfBike().get(rentNumber);

        if (bike.getAvailability().equals(Availability.BOOKED)) {
            System.out.println("This bike is BOOKED! Select another one");
            rentBike(client, bikeBase, scanner);
        } else {
            client.getBikeBase().getListOfBike().add(bike);
            System.out.println("You have rent: " + bike);
            bike.setAvailability(Availability.BOOKED);
            long startTime = System.currentTimeMillis();
            timeOfRenting.put(bike, startTime);
        }
    }

    public void returnBike(Client client, Scanner scanner) {
        System.out.print("Number of bike: ");
        int rentNumber = scanner.nextInt() - 1;
        Bike bike = client.getBikeBase().getListOfBike().get(rentNumber);
        bike.setAvailability(Availability.FREE);
        countTimeOfRenting(bike, client);
        client.getBikeBase().getListOfBike().remove(bike);
    }

    private void countTimeOfRenting(Bike bike, Client client) {
        long stopTime = System.currentTimeMillis();
        long startTime = timeOfRenting.get(bike);
        long elapsedTime = (stopTime - startTime) / 10000;

        int costOfRent = (int) elapsedTime * bike.getPrice().getAmount();
        client.getWallet().setMoney(client.getWallet().getMoney() - costOfRent);
        System.out.println("You have rent bike for: " + elapsedTime + " h");
        System.out.println("Cost of rent: $" + costOfRent);
        System.out.println("How you have: $" + client.getWallet().getMoney());
    }

}

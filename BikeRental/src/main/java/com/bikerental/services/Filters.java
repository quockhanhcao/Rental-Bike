package com.bikerental.services;

import com.bikerental.PrinterImpl;
import com.bikerental.bike.*;

import java.util.*;
import java.util.stream.Collectors;

public class Filters {

    public BikeBase filterList(BikeBase bikeBase, Scanner scanner) {

        System.out.print("Filter by:\n" +
                "1. Color\n" +
                "2. Brand\n" +
                "3. Price\n" +
                "4. Availability\n" +
                "Select: ");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                List<Bike> colors = filterByColor(bikeBase, scanner);
                bikeBase.getListOfBike().clear();
                bikeBase.getListOfBike().addAll(colors);
                return bikeBase;
            case 2:
                List<Bike> brands = filterByBrand(bikeBase, scanner);
                bikeBase.getListOfBike().clear();
                bikeBase.getListOfBike().addAll(brands);
                return bikeBase;
            case 3:
                List<Bike> prices = filterByPrice(bikeBase, scanner);
                bikeBase.getListOfBike().clear();
                bikeBase.getListOfBike().addAll(prices);
                return bikeBase;
            case 4:
                List<Bike> availability = filterByAvailability(bikeBase, scanner);
                bikeBase.getListOfBike().clear();
                bikeBase.getListOfBike().addAll(availability);
                return bikeBase;
            default:
                break;
        }
        return bikeBase;
    }

    private List<Bike> filterByColor(BikeBase bikeBase, Scanner scanner) {
        printerImpl.filterByColor();
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                return bikeBase.getListOfBike().stream()
                        .filter(bike1 -> bike1.getColor().equals(Color.RED))
                        .collect(Collectors.toList());
            case 2:
                return bikeBase.getListOfBike().stream()
                        .filter(bike1 -> bike1.getColor().equals(Color.BLUE))
                        .collect(Collectors.toList());
            case 3:
                return bikeBase.getListOfBike().stream()
                        .filter(bike -> bike.getColor().equals(Color.BLACK))
                        .collect(Collectors.toList());
            default:
        }
        return null;
    }

    private List<Bike> filterByBrand(BikeBase bikeBase, Scanner scanner) {
        printerImpl.filterByBrand();
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                return bikeBase.getListOfBike().stream()
                        .filter(bike1 -> bike1.getBrand().equals(Brand.SCOTT))
                        .collect(Collectors.toList());
            case 2:
                return bikeBase.getListOfBike().stream()
                        .filter(bike1 -> bike1.getBrand().equals(Brand.GIANT))
                        .collect(Collectors.toList());
            case 3:
                return bikeBase.getListOfBike().stream()
                        .filter(bike -> bike.getBrand().equals(Brand.TREK))
                        .collect(Collectors.toList());
            default:
        }
        return null;
    }

    private List<Bike> filterByPrice(BikeBase bikeBase, Scanner scanner) {
        printerImpl.filterByPrice();
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                return bikeBase.getListOfBike().stream()
                        .filter(bike -> bike.getPrice().equals(Price.TEN))
                        .collect(Collectors.toList());
            case 2:
                return bikeBase.getListOfBike().stream()
                        .filter(bike -> bike.getPrice().equals(Price.FIFTEEN))
                        .collect(Collectors.toList());
            case 3:
                return bikeBase.getListOfBike().stream()
                        .filter(bike -> bike.getPrice().equals(Price.TWENTY))
                        .collect(Collectors.toList());
            default:
        }
        return null;
    }

    private List<Bike> filterByAvailability(BikeBase bikeBase, Scanner scanner) {
        printerImpl.filterByAvailability();
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                return bikeBase.getListOfBike().stream()
                        .filter(bike1 -> bike1.getAvailability().equals(Availability.FREE))
                        .collect(Collectors.toList());
            case 2:
                return bikeBase.getListOfBike().stream()
                        .filter(bike1 -> bike1.getAvailability().equals(Availability.BOOKED))
                        .collect(Collectors.toList());
            default:
        }
        return null;
    }


}

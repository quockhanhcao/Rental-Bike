package com.bikerental.bike;

import java.util.ArrayList;
import java.util.List;

public class BikeBase {
    private List<Bike> listOfBike = createListOfBike();

    private List<Bike> createListOfBike() {
        listOfBike = new ArrayList<>();

        Bike bike1 = new Bike(Color.BLACK, Brand.SCOTT, Price.FIFTEEN, Availability.FREE);
        Bike bike2 = new Bike(Color.RED, Brand.GIANT, Price.FIFTEEN, Availability.BOOKED);
        Bike bike3 = new Bike(Color.BLUE, Brand.GIANT, Price.TEN, Availability.FREE);
        Bike bike4 = new Bike(Color.BLACK, Brand.TREK, Price.TWENTY, Availability.FREE);
        Bike bike5 = new Bike(Color.RED, Brand.TREK, Price.TEN, Availability.FREE);
        Bike bike6 = new Bike(Color.BLUE, Brand.SCOTT, Price.TWENTY, Availability.BOOKED);
        Bike bike7 = new Bike(Color.BLACK, Brand.GIANT, Price.TEN, Availability.FREE);
        Bike bike8 = new Bike(Color.RED, Brand.TREK, Price.FIFTEEN, Availability.FREE);
        Bike bike9 = new Bike(Color.BLUE, Brand.SCOTT, Price.FIFTEEN, Availability.BOOKED);
        Bike bike10 = new Bike(Color.BLACK, Brand.GIANT, Price.TEN, Availability.FREE);

        listOfBike.add(bike1);
        listOfBike.add(bike2);
        listOfBike.add(bike3);
        listOfBike.add(bike4);
        listOfBike.add(bike5);
        listOfBike.add(bike6);
        listOfBike.add(bike7);
        listOfBike.add(bike8);
        listOfBike.add(bike9);
        listOfBike.add(bike10);
        return listOfBike;
    }

    public List<Bike> getListOfBike() {
        return listOfBike;
    }
}

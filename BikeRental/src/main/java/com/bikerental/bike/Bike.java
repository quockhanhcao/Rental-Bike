package com.bikerental.bike;

public class Bike {
    Color color;
    Brand brand;
    Price price;
    Availability availability;

    public Bike(Color color, Brand brand, Price price, Availability availability) {
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.availability = availability;
    }

    public Color getColor() {
        return color;
    }

    public Brand getBrand() {
        return brand;
    }

    public Price getPrice() {
        return price;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Bike: " +
                "color: " + color +
                ", brand: " + brand +
                ", price: $" + price.getAmount() + "/h" +
                ", availability: " + availability +
                '}';
    }
}

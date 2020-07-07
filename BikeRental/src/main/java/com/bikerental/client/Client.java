package com.bikerental.client;

import com.bikerental.bike.BikeBase;

public class Client {
    private Wallet wallet = new Wallet();
    private BikeBase bikeBase = new BikeBase();

    public Wallet getWallet() {
        return wallet;
    }

    public BikeBase getBikeBase() {
        return bikeBase;
    }

}

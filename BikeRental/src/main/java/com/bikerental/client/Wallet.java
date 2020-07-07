package com.bikerental.client;

import java.util.Scanner;

public class Wallet {
    private int money = 0;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void transferMoney(Scanner scanner) {
        System.out.print("Amount of transfer: ");
        int transfer = scanner.nextInt();
        money += transfer;
    }

}

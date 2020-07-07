package com.bikerental.client;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

class WalletTest {
    private Wallet wallet;

    @BeforeEach
    public void setup() {
        wallet = new Wallet();
    }

    @Test
    public void transferTest() {
        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        client.getWallet().setMoney(200);
        int value = scanner.nextInt();
        wallet.transferMoney(scanner);

        Assertions.assertEquals(300, client.getWallet().getMoney());
    }


}
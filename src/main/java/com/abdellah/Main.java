package com.abdellah;

import proxy.BankWS;
import proxy.BanqueService;

public class Main {
    public static void main(String[] args) {
        BanqueService proxy = new BankWS().getBanqueServicePort();
        System.out.println(proxy.getAccount(2).getSalaire());
    }
}
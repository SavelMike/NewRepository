package com.company;

public class Balance {

    public static void main(String[] args) {
        double initialBalance = 1000;
        double interest = 0.05;
        double firstBalance = initialBalance + initialBalance * interest;
        double secondBalance = firstBalance + firstBalance * interest;
        double thirdBalance = secondBalance + secondBalance * interest;
        System.out.println("1) " + initialBalance + "$");
        System.out.println("2) " + firstBalance + "$");
        System.out.println("3) " + secondBalance + "$");
        System.out.println("4) " + thirdBalance + "$");

    }
}

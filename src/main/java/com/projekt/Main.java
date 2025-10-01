package com.projekt;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Welcome to " + CafeConfig.getInstance().getCafeName());

        System.out.println(DrinkFactory.createDrink("coffee").serve() + " in: " + CafeConfig.getInstance().getCafeName());
        System.out.println(DrinkFactory.createDrink("cola").serve());
    }
}
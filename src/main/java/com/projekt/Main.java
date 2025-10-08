package com.projekt;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Welcome to " + CafeConfig.getInstance().getCafeName());

        // Factory method, 2.cv
        System.out.println(DrinkFactory.createDrink("coffee").serve() + " in: " + CafeConfig.getInstance().getCafeName());
        System.out.println(DrinkFactory.createDrink("cola").serve());

        // Builder class, 3.cv
        CustomDrink meinCustomDrink = new CustomDrink.Builder("coffee").milk().sugar().caramel().build();
        System.out.println(meinCustomDrink + " in " + CafeConfig.getInstance().getCafeName());
    }
}
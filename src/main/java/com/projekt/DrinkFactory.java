/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.projekt;

/**
 *
 * @author ddeejjvviidd
 */
public class DrinkFactory {

    public static Drink createDrink(String type) {
        switch (type) {
            case "coffee":
                //OrderSubject.getInstance().notifyAll("Ordered Coffee");
                return new com.projekt.drinks.Coffee();
            case "cola":
                //OrderSubject.getInstance().notifyAll("Ordered Cola");
                return new com.projekt.drinks.Cola();
            default:
                throw new IllegalArgumentException("Unknown drink type: " + type);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projekt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 *
 * @author ddeejjvviidd
 */
class CustomDrinkTest {

    @Test
    void testCustomDrinkBuilder() {
        CustomDrink customDrink = new CustomDrink.Builder("coffee").milk().sugar().caramel().build();
        String expectedDescription = "Serving Jáva ☕! +milk +sugar +caramel";
        assertEquals(expectedDescription, customDrink.toString(), "Drink desc must match the expected string");
    }

    @Test
    void testCustomDrinkNoExtras() {
        CustomDrink customDrink = new CustomDrink.Builder("coffee").build();
        String expected = "Serving Jáva ☕!";
        assertEquals(expected, customDrink.toString(), "Without extras the description should be just the base serve text");
    }

    @Test
    void testCustomDrinkLemonForCola() {
        CustomDrink customDrink = new CustomDrink.Builder("cola").lemon().build();
        String expected = "Serving Coca-Cola! +lemon";
        assertEquals(expected, customDrink.toString(), "Cola with lemon should append +lemon");
    }

    @Test
    void testCustomDrinkDuplicateCalls() {
        CustomDrink customDrink = new CustomDrink.Builder("coffee").milk().milk().sugar().build();
        String expected = "Serving Jáva ☕! +milk +sugar";
        assertEquals(expected, customDrink.toString(), "Duplicate option calls must not duplicate text in description");
    }

    @Test
    void testUnknownBaseThrows() {
        // Using a base that DrinkFactory does not recognize should throw IllegalArgumentException
        CustomDrink customDrink = new CustomDrink.Builder("tit_milk").milk().build();
        // The factory should throw when asked to create an unknown base
        assertThrows(IllegalArgumentException.class, () -> {
            System.out.println(customDrink.toString());
        }, "Unknown base should cause IllegalArgumentException from DrinkFactory");
    }

}


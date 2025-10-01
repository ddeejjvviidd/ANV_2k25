/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projekt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author ddeejjvviidd
 */
class DrinkFactoryTest {

    @Test
    void testCoffe() {
        assertEquals("Serving Jáva ☕!", DrinkFactory.createDrink("coffee").serve(), "Must return 'Serving Jáva ☕'");
    }

    @Test
    void testCola() {
        assertEquals("Serving Coca-Cola!", DrinkFactory.createDrink("cola").serve(), "Must return 'Serving Coca-Cola!'");
    }

    @Test
    void testWrongType() {
        try {
            DrinkFactory.createDrink("cofefe");
        } catch (Exception e) {
            assertEquals(IllegalArgumentException.class, e.getClass(), "Must throw IllegalArgumentException");
            assertEquals("Unknown drink type: cofefe", e.getMessage(), "Must return 'Unknown drink type: cofefe'");
        }
    }

    @Test
    void testWrongUse() {
        assertNotEquals("Serving Jáva ☕!", DrinkFactory.createDrink("coffee"), "Must not return 'Serving Jáva ☕!'" );
    }
}


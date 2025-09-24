/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.projekt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;

/**
 *
 * @author ddeejjvviidd
 */
class CafeConfigTest {

    @Test
    void testCafeName() {
        CafeConfig config = CafeConfig.getInstance();
        assertEquals("Jáva ☕", config.getCafeName(), "Název kavárny musí být 'Jáva ☕'");
    }

    @Test
    void testSingletonInstance() {
        CafeConfig instance1 = CafeConfig.getInstance();
        CafeConfig instance2 = CafeConfig.getInstance();
        assertSame(instance1, instance2, "Obě instance musí být stejný objekt (singleton)");
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.projekt;

/**
 *
 * @author ddeejjvviidd
 */
public class CafeConfig {

    private static CafeConfig instance;

    private CafeConfig() {
        // Private constructor to prevent instantiation
    }

    public static synchronized CafeConfig getInstance() {
        if (instance == null) {
            instance = new CafeConfig();
        }
        return instance;
    }
}

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
    private final String cafeName; // final so it can not be change after initialization

    private CafeConfig() {
        // Private constructor to prevent instantiation
        cafeName = "Jáva ☕"; // initialization
    }

    public static synchronized CafeConfig getInstance() {
        // synchronized to make it thread-safe, so only one can access it at a time
        if (instance == null) {
            //create new instance if it does not exist yet
            instance = new CafeConfig();
        }
        return instance;
    }

    public String getCafeName() {
        // not static, because it works with instance variable cafeName
        return cafeName;
    }
}

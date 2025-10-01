/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.projekt.drinks;

/**
 *
 * @author ddeejjvviidd
 */
public class Coffee implements com.projekt.Drink {
    
    @Override
    // override because I am overwriting the method inherited from Drink
    public String serve() {
        return "Serving Jáva ☕!";
    }
    
}

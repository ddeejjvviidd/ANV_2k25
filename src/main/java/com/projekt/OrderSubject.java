/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.projekt;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ddeejjvviidd
 */
public class OrderSubject {

    private List<Observer> observers;

    public OrderSubject() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyAll(String status) {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }
    

}

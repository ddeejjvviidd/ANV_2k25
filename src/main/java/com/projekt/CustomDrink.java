/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.projekt;

/**
 *
 * @author ddeejjvviidd
 */
public class CustomDrink {

    private String base;
    private boolean milk;
    private boolean sugar;
    private boolean lemon;
    private boolean caramel;

    private CustomDrink(Builder builder) {
        this.base = builder.base;
        this.milk = builder.milk;
        this.sugar = builder.sugar;
        this.lemon = builder.lemon;
        this.caramel = builder.caramel;
    }

    @Override
    public String toString() {
        String description = DrinkFactory.createDrink(base).serve();
        if (milk) description += " +milk";
        if (sugar) description += " +sugar";
        if (lemon) description += " +lemon";
        if (caramel) description += " +caramel";
        return description;
    }


    public static class Builder {

        private String base;
        private boolean milk;
        private boolean sugar;
        private boolean lemon;
        private boolean caramel;

        public Builder(String base) {
            this.base = base;
        }

        public Builder milk() {
            this.milk = true;
            return this;
        }
        
        public Builder sugar() {
            this.sugar = true;
            return this;
        }

        public Builder lemon() {
            this.lemon = true;
            return this;
        }

        public Builder caramel() {
            this.caramel = true;
            return this;
        }

        public CustomDrink build() {
            return new CustomDrink(this);
        }
    }
}

package com.projekt;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Welcome to " + CafeConfig.getInstance().getCafeName());

        // Factory method, 2.cv
        System.out.println("======== 2.cv Factory Method ========");
        System.out.println(DrinkFactory.createDrink("coffee").serve() + " in: " + CafeConfig.getInstance().getCafeName());
        System.out.println(DrinkFactory.createDrink("cola").serve());

        // Builder class, 3.cv
        System.out.println("======== 3.cv Builder Pattern ========");
        CustomDrink meinCustomDrink = new CustomDrink.Builder("coffee").milk().sugar().caramel().build();
        System.out.println(meinCustomDrink + " in " + CafeConfig.getInstance().getCafeName());

        // Observer method, 5.cv
        System.out.println("======== 5.cv Observer Pattern ========");
        EmployeeObserver emp1 = new EmployeeObserver("Alice in Wonderland");
        EmployeeObserver emp2 = new EmployeeObserver("Till Lindemann");

        OrderSubject orderSubject = new OrderSubject();
        orderSubject.addObserver(emp1);
        orderSubject.addObserver(emp2);
        
        CustomDrink anotherDrink = new CustomDrink.Builder("cola").lemon().milk().build();
        String message = (anotherDrink + " in " + CafeConfig.getInstance().getCafeName());
        orderSubject.notifyAll(message);
    }
}
package com.example;

import com.example.Coffeeshop.Coffee;
import com.example.Coffeeshop.Espresso;
import com.example.Decorator.CoffeeDecorator;
import com.example.Decorator.SugarDecorator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            System.out.println("Decorator Design Pattern Example");

        Coffee espresso = new Espresso();
        System.out.println(espresso.getDescription() + " Cost: $" + espresso.getCost());

        CoffeeDecorator decorator = new SugarDecorator(espresso);
        System.out.println(decorator.getDescription() + " Cost: $" + decorator.getCost());
    }
}
package com.example;

import com.example.Composite.CompositeSmartComponent;
import com.example.SmartComponents.AirConditioner;
import com.example.SmartComponents.SmartComponent;
import com.example.SmartComponents.SmartLight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Composite Design Pattern Example");

        SmartComponent airConditioner = new AirConditioner();
        SmartComponent smartLight= new SmartLight();

        CompositeSmartComponent room1 = new CompositeSmartComponent();
        room1.addComponent(airConditioner);
        room1.addComponent(smartLight);

        CompositeSmartComponent room2 = new CompositeSmartComponent();
        room2.addComponent(new SmartLight());
        room2.addComponent(new AirConditioner());

        CompositeSmartComponent house = new CompositeSmartComponent();
        house.addComponent(room1);
        house.addComponent(room2);

        house.turnOn();
        house.turnOff();
    }
}
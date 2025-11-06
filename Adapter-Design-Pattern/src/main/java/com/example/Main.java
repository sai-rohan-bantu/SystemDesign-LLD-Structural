package com.example;

import com.example.Adapters.AirConditionerAdapter;
import com.example.Adapters.CoffeeMachineAdapter;
import com.example.Adapters.SmartDevice;
import com.example.Adapters.SmartLightAdapter;
import com.example.Devices.AirConditioner;
import com.example.Devices.CoffeeMachine;
import com.example.Devices.SmartLight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
           System.out.println("Adapter Design Pattern Example");

        SmartDevice airConditioner =
                new AirConditionerAdapter(new AirConditioner());
        SmartDevice smartLight = new SmartLightAdapter(new SmartLight());
        SmartDevice coffeeMachine = new CoffeeMachineAdapter(new CoffeeMachine());
        // Control devices through the unified interface
        airConditioner.turnOn();
        smartLight.turnOn();
        coffeeMachine.turnOn();
        airConditioner.turnOff();
        smartLight.turnOff();
        coffeeMachine.turnOff();

    }
}
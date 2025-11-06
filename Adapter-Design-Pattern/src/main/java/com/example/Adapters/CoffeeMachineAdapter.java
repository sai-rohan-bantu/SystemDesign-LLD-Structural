package com.example.Adapters;

public class CoffeeMachineAdapter implements SmartDevice {
    private final com.example.Devices.CoffeeMachine coffeeMachine;

    public CoffeeMachineAdapter(com.example.Devices.CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void turnOn() {
        coffeeMachine.initializeZigbeeConnection();
        coffeeMachine.startBrewing();
    }

    @Override
    public void turnOff() {
        coffeeMachine.stopBrewing();
        coffeeMachine.terminateZigbeeConnection();
    }
}

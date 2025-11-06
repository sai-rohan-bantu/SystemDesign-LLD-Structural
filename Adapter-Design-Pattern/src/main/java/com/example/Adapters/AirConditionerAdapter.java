package com.example.Adapters;

import com.example.Devices.AirConditioner;

public class AirConditionerAdapter implements SmartDevice {
    private final AirConditioner airConditioner;

    public AirConditionerAdapter(com.example.Devices.AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void turnOn() {
        airConditioner.connectViaBluetooth();
        airConditioner.startCooling();
    }

    @Override
    public void turnOff() {
        airConditioner.stopCooling();
        airConditioner.disconnectBluetooth();
    }
}

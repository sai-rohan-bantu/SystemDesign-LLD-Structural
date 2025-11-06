package com.example.Adapters;

public class SmartLightAdapter implements SmartDevice {
    private final com.example.Devices.SmartLight smartLight;

    public SmartLightAdapter(com.example.Devices.SmartLight smartLight) {
        this.smartLight = smartLight;
    }

    @Override
    public void turnOn() {
        smartLight.connectToWiFi();
        smartLight.switchOn();
    }

    @Override
    public void turnOff() {
        smartLight.switchOff();
        smartLight.disconnectWiFi();
    }
}

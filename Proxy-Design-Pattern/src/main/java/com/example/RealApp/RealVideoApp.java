package com.example.RealApp;

public class RealVideoApp implements VideoApp {
    @Override
    public void playVedio(String userType, String videoName) {
        System.out.println("Playing video: " + videoName + " for user type: " + userType);
    }
}

package com.example;

import com.example.Proxy.ProxyVideoApp;
import com.example.RealApp.RealVideoApp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to Proxy Design Pattern Example!");

        RealVideoApp realService = new RealVideoApp();
        ProxyVideoApp proxyService = new ProxyVideoApp(realService);
        // Free user trying to watch a video
        proxyService.playVedio("free", "Free Video 1");
        // Premium user trying to watch a video
        proxyService.playVedio("premium", "Premium Video 1");
        // Unauthorized user
        proxyService.playVedio("guest", "Video 1");
        // Too many requests
        for (int i = 0; i < 6; i++) {
            proxyService.playVedio("free", "Free Video 2");
        }
    }
}
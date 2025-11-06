package com.example.Proxy;

import com.example.RealApp.RealVideoApp;
import com.example.RealApp.VideoApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ProxyVideoApp implements VideoApp {
    private RealVideoApp realVideoApp;
    private Map<String,String> cachedVideos = new HashMap<>();
    private Map<String, Integer> requestCounts = new HashMap<>();

    public ProxyVideoApp(RealVideoApp realVideoApp) {
        this.realVideoApp = realVideoApp;
    }

    @Override
    public void playVedio(String userType, String videoName) {
       if(!userType.equals("premium") && videoName.startsWith("Premium")){
           System.out.println("Access denied. Upgrade to premium to watch this video: " + videoName);
           return;
       }

       requestCounts.put(userType, requestCounts.getOrDefault(userType, 0) + 1);
         if(requestCounts.get(userType) > 5 && !userType.equals("premium")){
              System.out.println("Access denied. Free users can only watch 5 videos. Upgrade to premium for unlimited access.");
              return;
         }
         if(cachedVideos.containsKey(videoName)){
              System.out.println("Serving from cache: " + videoName);
              System.out.println(cachedVideos.get(videoName));
            } else {
                realVideoApp.playVedio(userType, videoName);
                cachedVideos.put(videoName, "Playing video: " + videoName + " for user type: " + userType);
         }
    }
}

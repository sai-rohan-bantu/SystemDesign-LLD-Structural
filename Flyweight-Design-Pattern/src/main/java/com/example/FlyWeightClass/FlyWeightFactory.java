package com.example.FlyWeightClass;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
    private ParticleType particleType;
    private Map<String, ParticleType> particleTypeMap = new HashMap<>();

    public ParticleType getParticleType(String color, String sprite) {
        String key = color + "-" + sprite;
        if (!particleTypeMap.containsKey(key)) {
            particleType = new ParticleType(color, sprite);
            particleTypeMap.put(key, particleType);
        }
        return particleTypeMap.get(key);
    }
}

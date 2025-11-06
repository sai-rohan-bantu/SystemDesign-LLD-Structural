package com.example.FlyWeightClass;

public class ParticleType {
    private String color;
    private String sprite;

    public ParticleType(String color, String sprite) {
        this.color = color;
        this.sprite = sprite;
    }

    public void render(int x, int y) {
        System.out.println("Rendering particle of color " + color + " with sprite " + sprite + " at (" + x + ", " + y + ")");
    }
}

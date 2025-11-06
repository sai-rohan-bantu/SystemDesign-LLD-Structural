package com.example.Renderers;

public class VectorRenderer implements Renderer {
    @Override
    public String renderCircle(int radius) {
        return "Drawing a circle of radius " + radius + " using Vector Renderer";
    }

    @Override
    public String renderRectangle(int width, int height) {
        return "Drawing a rectangle of width " + width + " and height " + height + " using Vector Renderer";
    }
}

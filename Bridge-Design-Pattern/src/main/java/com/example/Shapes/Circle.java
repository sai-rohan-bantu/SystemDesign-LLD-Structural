package com.example.Shapes;

import com.example.Renderers.Renderer;

public class Circle extends Shape {
    private int radius;

    public Circle(Renderer renderer, int radius) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    public String draw() {
        return renderer.renderCircle(radius);
    }
}

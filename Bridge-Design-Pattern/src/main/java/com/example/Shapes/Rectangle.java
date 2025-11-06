package com.example.Shapes;

import com.example.Renderers.Renderer;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(Renderer renderer, int width, int height) {
        super(renderer);
        this.width = width;
        this.height = height;
    }

    @Override
    public String draw() {
        return renderer.renderRectangle(width, height);
    }
}

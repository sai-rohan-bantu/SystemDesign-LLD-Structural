package com.example.Shapes;

import com.example.Renderers.Renderer;

public abstract class Shape {
    public Renderer renderer;
    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }
    public abstract String draw();
}

package com.example;

import com.example.Renderers.RasterRenderer;
import com.example.Renderers.Renderer;
import com.example.Renderers.VectorRenderer;
import com.example.Shapes.Circle;
import com.example.Shapes.Rectangle;
import com.example.Shapes.Shape;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bridge Design Pattern Example");

        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle = new Circle(vectorRenderer, 5);
        System.out.println(circle.draw());

        Shape rectangle = new Rectangle(rasterRenderer, 4, 6);
        System.out.println(rectangle.draw());
    }
}
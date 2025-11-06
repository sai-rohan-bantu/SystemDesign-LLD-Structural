package com.example;

import com.example.Extrinsic.Particle;
import com.example.FlyWeightClass.FlyWeightFactory;
import com.example.FlyWeightClass.ParticleType;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to Flyweight Design Pattern Example!");

        FlyWeightFactory factory = new FlyWeightFactory();
        List<Particle> particles = new ArrayList<>();
        // Create thousands of particles using shared flyweights
        ParticleType explosionType = factory.getParticleType("red", "explosion.png");

        for (int i = 0; i < 1000; i++) {
            particles.add(new Particle(
                    100,
                    100,
                    explosionType,
                    5));
        }
        // Update all particles
        for (Particle particle : particles) {
            particle.update();
        }
    }
}
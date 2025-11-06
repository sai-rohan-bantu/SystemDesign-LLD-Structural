package com.example.Extrinsic;

import com.example.FlyWeightClass.ParticleType;

public class Particle {
    private int x;
    private int y;
    private ParticleType particleType;

    private int velocity;

    public Particle(int x, int y, ParticleType particleType, int velocity) {
        this.x = x;
        this.y = y;
        this.particleType = particleType;
        this.velocity = velocity;
    }

    public void update() {
        y+=velocity;
        particleType.render(x, y);
    }
}

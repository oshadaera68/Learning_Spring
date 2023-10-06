package com.dev;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

@Component

public class Bmw implements Vehicle {
    private Engine engine;

    @Value("${car.code}")
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Bmw(Engine engine) {
        this.engine = engine;
    }

    @Override
    public int getSpeed() {
        return new Random().nextInt(250);
    }

    @Override
    public String getCapacity() {
        return engine.showCapacity();
    }
}
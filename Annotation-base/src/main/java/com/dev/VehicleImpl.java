package com.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

@Component("bmw")
@Scope("prototype")
public class VehicleImpl implements Vehicle {
    private Engine engine;

    @Autowired
    public VehicleImpl(Engine engine) {
        this.engine = engine;
    }

    @Override
    public int checkSpeed() {
        return new Random().nextInt(250);
    }

    @Override
    public String checkCapacity() {
        return engine.getCapacity();
    }
}

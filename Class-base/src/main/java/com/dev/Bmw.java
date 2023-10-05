package com.dev;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

@Component
public class Bmw implements Vehicle {
    @Override
    public int getSpeed() {
        return new Random().nextInt(250);
    }
}

package com.dev;

import org.springframework.stereotype.Component;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

@Component
public class EngineImpl implements Engine {
    @Override
    public String showCapacity() {
        return "1000CC";
    }
}

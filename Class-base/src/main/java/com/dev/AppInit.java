package com.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class AppInit {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext c
                = new AnnotationConfigApplicationContext(BeanConfig.class);
        Vehicle mb = c.getBean("bmw", Vehicle.class);
        System.out.println(mb.getSpeed());
    }
}

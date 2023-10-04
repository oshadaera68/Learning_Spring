package com.dev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

public class AppInitializer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Vehicle bmw1= c.getBean("bmw", Vehicle.class);
        Vehicle bmw5 = c.getBean("bmw", Vehicle.class);
        System.out.println(bmw1==bmw5);
    }
}

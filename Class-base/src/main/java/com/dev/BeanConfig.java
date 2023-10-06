package com.dev;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

@Configuration
@ComponentScan("com.dev")
@PropertySource("classpath:application.properties")
public class BeanConfig {
}

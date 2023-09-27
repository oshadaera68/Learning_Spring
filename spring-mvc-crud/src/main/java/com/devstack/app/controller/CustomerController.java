package com.devstack.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

@Controller
@RequestMapping("/customer")
public class CustomerController {
    public String testEndPoint(){
        return "Hello Client! I'm the customer here!";
    }
}

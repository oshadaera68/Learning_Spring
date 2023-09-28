package com.devstack.app.controller;

import com.devstack.app.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

@Controller

public class CustomerController {
    @RequestMapping("/customer") //localhost:8080/customer
    public String testEndPoint(){
        return "Hello Client! I'm the customer here!";
    }


    public String newCustomer(){
        return "";
    }

    public String findCustomer(){
        return "";
    }

    public String deleteCustomer(){
        return "";
    }

    public String findAllCustomers(){
        return "";
    }

    public String updateCustomer(){
        return "";
    }

}
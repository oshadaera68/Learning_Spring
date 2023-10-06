package com.dev.pos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Coded By: Era Boy
 * Version: v0.1.0
 **/

@Controller
public class CustomerController {
    @RequestMapping("/")
    public String loadMainPage() {
        return "main";
    }
}

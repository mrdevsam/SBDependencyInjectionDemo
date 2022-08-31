package com.example.didemo.controllers;

//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.didemo.services.GreetingService;

@Controller
public class MyController {
    
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("Helllo - inside MyController.");

        return greetingService.sayGreeting();
    }
}

package com.example.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.didemo.services.GreetingService;

@Controller
public class PropertyInjectedController {
    
    @Autowired
    @Qualifier("greetingServiceImpl") 
    public GreetingService greetingServiceImpl;//above qualifier is indicating to GreetingServiceImpl class

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }
}

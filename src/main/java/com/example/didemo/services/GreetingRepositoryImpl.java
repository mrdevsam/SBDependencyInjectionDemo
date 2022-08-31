package com.example.didemo.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository{

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary greeting service";
    }

    @Override
    public String getGermanGreeting() {
        return "Hello - German greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hello - Spanish greeting service";
    }
    
}

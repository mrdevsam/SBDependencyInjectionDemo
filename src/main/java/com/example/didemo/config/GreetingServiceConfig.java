package com.example.didemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.example.didemo.services.GreetingRepository;
import com.example.didemo.services.GreetingService;
import com.example.didemo.services.GreetingServiceFactory;

@Configuration
public class GreetingServiceConfig {
    
    @Bean
    GreetingServiceFactory gServiceFactory(GreetingRepository repository) {
        return new GreetingServiceFactory(repository);
    }

    @Bean
    @Primary
    @Profile({"default", "en"})
    GreetingService primaryGreetingService(GreetingServiceFactory gServiceFactory) {
        return gServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("es")
    GreetingService primarySpanishGreetingService(GreetingServiceFactory gServiceFactory) {
        return gServiceFactory.createGreetingService("es");
    }

    @Bean
    @Primary
    @Profile("de")
    GreetingService primaryGermanGreetingService(GreetingServiceFactory gServiceFactory) {
        return gServiceFactory.createGreetingService("de");
    }

}

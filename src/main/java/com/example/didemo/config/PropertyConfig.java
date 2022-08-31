package com.example.didemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.example.didemo.examplebeans.FakeDataSource;
import com.example.didemo.examplebeans.JmsSource;

@Configuration
public class PropertyConfig {
    
    @Value("${wolf.username}")
    String username;

    @Value("${wolf.password}")
    String password;

    @Value("${wolf.dburl}")
    String url;

    @Value("${wolf.jms.username}")
    String juser;

    @Value("${wolf.jms.password}")
    String jpassword;
    
    @Value("${wolf.jms.url}")
    String jurl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fDataSource = new FakeDataSource();
        fDataSource.setUser(username);
        fDataSource.setPassword(password);
        fDataSource.setUrl(url);

        return fDataSource;
    }

    @Bean
    public JmsSource jmsSource() {
        JmsSource jSource = new JmsSource();
        jSource.setJuser(juser);
        jSource.setJpassword(jpassword);
        jSource.setJurl(jurl);

        return jSource;
    }

}

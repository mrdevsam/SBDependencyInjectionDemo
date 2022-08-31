package com.example.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.didemo.controllers.*;
import com.example.didemo.examplebeans.FakeDataSource;
import com.example.didemo.examplebeans.JmsSource;

@SpringBootApplication
public class DidemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DidemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		JmsSource jSource = (JmsSource) ctx.getBean(JmsSource.class);
		
		System.out.println("Output from MyController: " + controller.hello());
		System.out.println("Output from FakeDataSource: " + fSource.getUser());
		System.out.println("Output from JmsSource: " + jSource.getJuser());
		
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
	}

}

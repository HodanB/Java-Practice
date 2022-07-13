package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.animal.*;



@SpringBootApplication
public class MayEnable2ApiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MayEnable2ApiApplication.class, args);
		System.out.println("Found the bean: " + context.getBean(BirdController.class));
	}
}

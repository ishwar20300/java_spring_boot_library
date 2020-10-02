package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/*
import org.springframework.boot.web.support.SpringBootServletInitializer;*/
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.demo"})
@EntityScan( basePackages = {"com.demo"} )
@SpringBootApplication
public class DemoServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DemoServletInitializer.class);
	}

	public static void main(String[] args) throws Exception {
		System.setProperty("file.encoding", "UTF-8");
		SpringApplication.run(DemoServletInitializer.class, args);
	}

}
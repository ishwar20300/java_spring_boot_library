package com.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan(basePackages = {"com.demo"})
@EntityScan( basePackages = {"com.demo"} )
@SpringBootApplication
@EnableScheduling
public class DemoApplication {

	public static void main(String[] args) {
		System.setProperty("server.port","8088");
		System.setProperty("file.encoding", "UTF-8");
		SpringApplication.run(DemoApplication.class, args);
	}
}

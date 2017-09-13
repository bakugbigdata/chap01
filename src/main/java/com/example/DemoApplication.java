package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.domain.Dept;

import lombok.extern.java.Log;

@SpringBootApplication
@Log
public class DemoApplication {

	@Bean
	public Dept dept() {
		log.info("***");
		log.info("*** DemoApplication.dept()");
		log.info("***");
		return new Dept(90, "xxx", "yyy");
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args).close();
	}

}
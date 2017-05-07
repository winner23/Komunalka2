package com.winner.Komunalka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.winner.Komunalka.controlers.Hello;

@SpringBootApplication
public class KomunalkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KomunalkaApplication.class, args);
		
		Hello hello = new Hello();
		
		
	}
}

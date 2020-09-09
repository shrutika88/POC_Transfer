package com.example.calculator.addition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdditionApplication {

	public static void main(String[] args) {
		Addition ad = new Addition();
		int x = ad.add(5,8);
		System.out.println(x);
	}

}

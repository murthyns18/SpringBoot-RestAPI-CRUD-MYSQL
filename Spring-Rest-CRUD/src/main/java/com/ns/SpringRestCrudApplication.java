package com.ns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ns")
public class SpringRestCrudApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(SpringRestCrudApplication.class, args);
	}

}


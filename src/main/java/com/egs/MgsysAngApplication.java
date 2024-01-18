package com.egs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MgsysAngApplication {

	int index;
	
	public void main(String args)
	{
		System.out.println("2nd Main Method ");
	}
	
	public static void main(String[] args) {
	
		
	
		SpringApplication.run(MgsysAngApplication.class, args);
	}

}

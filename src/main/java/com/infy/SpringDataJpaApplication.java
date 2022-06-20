package com.infy;

import org.hibernate.service.Service;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infy.dto.Product;

@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	public void addProduct() {
		Product P = new Product(1,"Chocklate",5,10);
		service.addProduct(P);
	}

}

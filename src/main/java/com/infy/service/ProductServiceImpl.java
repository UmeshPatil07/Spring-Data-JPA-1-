package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.Product;
import com.infy.repository.ProductRepository;

@Service
public class ProductServiceImpl {

	@Autowired
	ProductRepository repo;
	
	public boolean addProduct(Product P) {
		repo.save(P);
		return true;
	}
}

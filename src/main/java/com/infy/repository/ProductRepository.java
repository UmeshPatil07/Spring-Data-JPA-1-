package com.infy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.dto.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{

}

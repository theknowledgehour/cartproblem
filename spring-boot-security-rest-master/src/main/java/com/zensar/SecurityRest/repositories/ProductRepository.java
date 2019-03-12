package com.zensar.SecurityRest.repositories;

import org.springframework.data.repository.CrudRepository;

import com.zensar.SecurityRest.models.Product;

public interface ProductRepository extends CrudRepository<Product, String> {
	
	@Override
    void delete(Product deleted);
}

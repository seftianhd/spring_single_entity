package com.restapivalidasi.models.repos;

import org.springframework.data.repository.CrudRepository;

import com.restapivalidasi.models.entities.Product;

public interface ProductRepo extends CrudRepository <Product, Long>{
    
}

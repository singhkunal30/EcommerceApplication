package com.kunal.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.kunal.ecommerce.model.Product;

@CrossOrigin("*")
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
}

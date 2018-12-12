package com.playgroundbharat.springweb.productrestapi.repository;

import com.playgroundbharat.springweb.productrestapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}

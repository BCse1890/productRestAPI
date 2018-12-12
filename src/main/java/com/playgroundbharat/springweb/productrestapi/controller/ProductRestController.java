package com.playgroundbharat.springweb.productrestapi.controller;

import com.playgroundbharat.springweb.productrestapi.model.Product;
import com.playgroundbharat.springweb.productrestapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductRestController {

    @Autowired
    ProductRepository repository;

    @RequestMapping(value="/products/", method= RequestMethod.GET)
    public List<Product> getProducts() {
        return repository.findAll();
    }

    @RequestMapping(value="/products/{id}", method=RequestMethod.GET)
    public Product getProduct(@PathVariable("id") int id) {
        return repository.findById(id).get();
    }


    @RequestMapping(value="/products/", method=RequestMethod.POST)
    public Product craateProduct(@RequestBody Product product) {
        return repository.save(product);
    }

    @RequestMapping(value="/products/", method=RequestMethod.PUT)
    public Product updateProduct(@RequestBody Product product) {
        return repository.save(product);
    }

    @RequestMapping(value="/products/{id}", method=RequestMethod.DELETE)
    public void deleteProduct(@PathVariable("id") int id) {
        repository.deleteById(id);
    }

}

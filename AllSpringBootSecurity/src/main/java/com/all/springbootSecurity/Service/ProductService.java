/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.all.springbootSecurity.Service;

import com.all.springbootSecurity.Model.product;
import com.all.springbootSecurity.Repository.ProductRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author anhha
 */
@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository productrepo;

    @Override
    public List<product> getAllProduct() {
        return productrepo.findAll();
    }

    @Override
    public void updateProduct(product product) {
        productrepo.save(product);
    }

    @Override
    public void addProduct() {

    }

    @Override
    public void deleteProduct(int id) {
        Optional<product> product = productrepo.findById(id);
        if (product.isPresent()) {
            productrepo.delete(product.get());
        }
    }

    @Override
    public void saveProduct(product product) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

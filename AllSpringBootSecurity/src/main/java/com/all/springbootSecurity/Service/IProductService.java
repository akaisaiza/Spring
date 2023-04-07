/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.all.springbootSecurity.Service;

import com.all.springbootSecurity.Model.product;
import java.util.List;

/**
 *
 * @author anhha
 */
public interface IProductService {
    
    List<product> getAllProduct();
    
    void updateProduct(product product);

    void addProduct();

    void deleteProduct(int id);

    void saveProduct(product product);
}

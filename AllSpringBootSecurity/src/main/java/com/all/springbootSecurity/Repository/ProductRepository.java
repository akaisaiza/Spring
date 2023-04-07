/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.all.springbootSecurity.Repository;

import com.all.springbootSecurity.Model.product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author anhha
 */
public interface ProductRepository extends JpaRepository<product, Integer>{
    
}

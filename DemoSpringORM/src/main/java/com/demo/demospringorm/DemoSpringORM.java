/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.demo.demospringorm;

import java.util.Arrays;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

/**
 *
 * @author anhha
 */
public class DemoSpringORM {

    public static void main(String[] args) {
        //Create Spring application context
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		//Get service from context. (service's dependency (ProductDAO) is autowired in ProductService)
		ProductImpl productService = ctx.getBean(ProductImpl.class);
		
		//Do some data operation
		
		
		
		System.out.println("listAll: " + productService.listProduct());
		
		
		ctx.close();
    }
}

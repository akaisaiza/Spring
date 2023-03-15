package com.demo.demospringorm;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public interface ProductDao {

	public List<Product> listProduct();
         

}

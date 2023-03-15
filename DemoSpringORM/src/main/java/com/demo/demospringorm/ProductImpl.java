/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.demospringorm;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author anhha
 */
public class ProductImpl implements ProductDao {

    private SessionFactory sessionFactory;

    public ProductImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Product> listProduct() {
        Session s = sessionFactory.openSession();
        List<Product> list = new ArrayList<>();
        try {
            s.beginTransaction();
            TypedQuery<Product> p = s.createQuery("from Product", Product.class);
            list = p.getResultList();
            s.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return list;
    }

}

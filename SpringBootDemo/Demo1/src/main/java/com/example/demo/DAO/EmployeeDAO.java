/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.DAO;

import com.example.demo.Model.Employee;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

/**
 *
 * @author anhha
 */
@Repository
public class EmployeeDAO {
    
    private static final Map<Integer,Employee> mapEmplyee = new HashMap<Integer,Employee>();
    static {
        Employee e = new Employee(1, "anh");
        Employee e1 = new Employee(2,"Quoc");
        Employee e2 = new Employee(3,"Hoang");
        mapEmplyee.put(e.getId(), e);
        mapEmplyee.put(e1.getId(), e1);
        mapEmplyee.put(e2.getId(), e2);
    }
    public Employee getEmploybyId(int id){
        return mapEmplyee.get(id);
    }
    public Employee AddEmployee(Employee e){
        mapEmplyee.put(e.getId(), e);
        return e;
    }
    public Employee UpdateEmployee(Employee e){
        mapEmplyee.put(e.getId(), e);
        return e;
    }
    public void removeEmployee(int id){
        mapEmplyee.remove(id);
    }
    public List<Employee> listEmployee(){
        
        List<Employee> listE = new ArrayList<Employee>();
        listE.addAll(mapEmplyee.values());
        return listE;
    }
}

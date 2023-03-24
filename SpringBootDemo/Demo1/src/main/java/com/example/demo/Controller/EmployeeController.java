/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Controller;

import com.example.demo.DAO.EmployeeDAO;
import com.example.demo.Model.Employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author anhha
 */
@RestController
public class EmployeeController {
    @Autowired
    EmployeeDAO employeedao = new EmployeeDAO();
    
    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<Employee>  listEmployee(){
        List<Employee> list = employeedao.listEmployee();
        return list;
    }
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public Employee  getEmployee(@PathVariable("id") int id){
        System.out.println("hello"+employeedao.getEmploybyId(id));
        return employeedao.getEmploybyId(id);
    }
    @RequestMapping(value = "/employee",method = RequestMethod.POST)
    public Employee AddEmployee(@RequestBody Employee e){
        
        return employeedao.AddEmployee(e);
    }
    @RequestMapping(value = "/employee",method = RequestMethod.PUT)
    public Employee UpdateEmployee(@RequestBody Employee e){
        
        return employeedao.UpdateEmployee(e);
    }
    @RequestMapping(value = "/employee/{id}",method = RequestMethod.DELETE)
    public void DeleteEmployeeId(@PathVariable("id") int id){
         employeedao.removeEmployee(id);
    }
    
}

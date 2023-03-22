/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.componentspringmvc.Controller;

import com.demo.componentspringmvc.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Quanh
 */
@Controller
public class jsonController {
   @RequestMapping("/json")
  @ResponseBody
  public User testJSON() {
    User user = new User("anh", "Quocanh123");
    return user;
  }
   
    
}

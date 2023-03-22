/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.componentspringmvc.Controller;

import com.demo.componentspringmvc.Model.User;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import org.springframework.web.bind.annotation.SessionAttributes;


/**
 *
 * @author Quanh
 */
@Controller
@SessionAttributes({"username","pass"})
public class LoginController {
	
        @RequestMapping("/")
	public String index() {
		return "login";
	}
	
	@RequestMapping(value = "login" ,method=RequestMethod.POST)
	public String index(@Valid @ModelAttribute("user") User user ,BindingResult bindingResult,Model model,HttpSession session){
		if(bindingResult.hasErrors()){
			return "login";
		}
                session.setAttribute("username", user.getUsername());
                model.addAttribute("pass", user.getPassword());
		return "redirect:/menu";
	}
        @RequestMapping("/session")
	public String Session() {
		return "session";
	}
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.componentspringmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author Quanh
 */
@Controller
public class baseController {

    @RequestMapping("/redirect")
    public RedirectView redirect(@RequestParam("name") String name, RedirectAttributes redirectAttributes) {
        System.out.println(name);
        redirectAttributes.addAttribute("name", name);
        return new RedirectView("page");
    }

    @RequestMapping("/page")
    public String page2(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name.toUpperCase());
        return "page";
    }
    @RequestMapping("/api1")
    @ResponseBody
    public String getFoos(@RequestParam String id) {
        return "ID: " + id;
    }
   
}

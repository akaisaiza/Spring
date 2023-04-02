package com.example.SpringSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class SpringSecurityApplication {
    @RequestMapping(value = {"/", "/home"})
    public String homepage() {
        return "home"; 
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello"; 
    }
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
	}

}

package com.example.Springboot.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class SpringbootApplication {

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Congratulations!");
        model.addAttribute("msg", "You have successfully deployed a Spring Boot application through your CI/CD pipeline");
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }
}

package com.example.demo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/dogtor")
public class indexController {
    
    @GetMapping
    public String index() {
        return "true";
    }
}


package com.example.demoMicroservicio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1 {
    @GetMapping("/hola")
    public String getMessage() {
        return "hola desde Docker!";
    }
}
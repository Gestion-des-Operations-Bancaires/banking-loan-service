package com.example.loan_service.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/transaction")
@CrossOrigin(origins = "*")
public class loanController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from loan Service!";
    }
}
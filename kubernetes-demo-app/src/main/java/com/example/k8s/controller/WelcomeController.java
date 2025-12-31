package com.example.k8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demok8s")
public class WelcomeController {

    @GetMapping
    public String getMessage(){
        return "Welcome to spring boot application through Kubernetes(K8s) !";
    }
}

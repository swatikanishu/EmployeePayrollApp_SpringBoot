package com.example.employeepayrollapp.controller;

import com.example.employeepayrollapp.model.Model;
import com.example.employeepayrollapp.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class Controller {

    @Autowired
    HelloService service;

    @GetMapping(value = {"", "/", "/home"})
    public String emp(@RequestParam(value = "name", defaultValue = "Swatika") String name) {
        return "welcome to employee pay roll app";
    }

    @GetMapping("/service")
    public String serviceCall() {
        return service.helloMessage();
    }
    @PostMapping("/post")
    public Model addEmpData(@RequestBody Model empData) {
        service.saveData(empData);
        return empData;
    }


}


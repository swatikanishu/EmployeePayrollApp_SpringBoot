package com.example.employeepayrollapp.services;

import com.example.employeepayrollapp.model.Model;
import com.example.employeepayrollapp.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
@Autowired
Repo repository;
    public String helloMessage() {
        return "Welcome To employeepayroll";
    }
    public Model saveData(Model payroll) {
        repository.save(payroll);
        return payroll;
    }
}

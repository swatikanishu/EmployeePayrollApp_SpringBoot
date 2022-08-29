package com.example.employeepayrollapp.services;

import com.example.employeepayrollapp.model.Model;
import com.example.employeepayrollapp.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public Optional<Model> sayHelloById(long id) {
        return repository.findById(id);

    }
    public List<Model> findByAllGreet(){
        return repository.findAll();
    }
    public Model editGreeting(Model greeting, long id) {
        Model existingGreet = repository.findById(id).orElse(null);
        if (existingGreet != null) {
            existingGreet.setDepartment(greeting.getDepartment());
            existingGreet.setSalary(greeting.getSalary());
            existingGreet.setEmployeeId(greeting.getEmployeeId());
            existingGreet.setEmployeeName(greeting.getEmployeeName());
            existingGreet.setProfilePic(greeting.getProfilePic());
            existingGreet.setGender(greeting.getGender());
            existingGreet.setNotes(greeting.getNotes());
            existingGreet.setDepartment(greeting.getDepartment());
            existingGreet.setStartDate(greeting.getStartDate());
            return repository.save(existingGreet);
        } else
            return null;
    }
    public void deletePayroll(long id) {
        repository.deleteById(id);
    }
}

package com.example.employeepayrollapp.services;

import com.example.employeepayrollapp.dto.EmployeeDto;
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

    public Model saveData(EmployeeDto payroll) {
        Model newuser =new Model (payroll);
        repository.save(newuser);

        return newuser;
    }
    public Optional<Model> sayHelloById(Long id) {
        return repository.findById(id);

    }
    public List<Model> findByAllPayroll(){
        return repository.findAll();
    }
    public Model editPayroll(EmployeeDto employeeData, Long id) {
        Model existingData = repository.findById(id).orElse(null);
        if (existingData != null) {
            existingData.setSalary(employeeData.getSalary());
            existingData.setEmployeeName(employeeData.getEmployeeName());
            existingData.setProfilePic(employeeData.getProfilePic());
            existingData.setGender(employeeData.getGender());
            existingData.setNotes(employeeData.getNotes());
            existingData.setDepartment(employeeData.getDepartment());
            existingData.setStartDate(employeeData.getStartDate());
            return repository.save(existingData);
        } else
            return null;
    }
    public void deletePayroll(Long id) {
        repository.deleteById(id);
    }


}

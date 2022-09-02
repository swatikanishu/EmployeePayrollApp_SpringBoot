package com.example.employeepayrollapp.services;

import com.example.employeepayrollapp.dto.EmployeeDto;
import com.example.employeepayrollapp.model.Model;

import java.util.List;
import java.util.Optional;

public interface IService {
    String helloMessage();
    Model saveData(EmployeeDto emp);
    Optional<Model> sayHelloById(Long id);
    List<Model> findByAllPayroll();
    Model editPayroll( EmployeeDto model, Long employeeId);
    void deletePayroll(Long employeeId);

    List<Model> getEmployeesByDepartment(String department);
}

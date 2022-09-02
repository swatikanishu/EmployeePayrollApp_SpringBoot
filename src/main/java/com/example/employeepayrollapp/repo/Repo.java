package com.example.employeepayrollapp.repo;

import com.example.employeepayrollapp.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface Repo extends JpaRepository<Model, Long> {
    @Query(value="SELECT * FROM employee_payroll_app_employee_payroll, employee_department WHERE employee_id = id AND department = :department", nativeQuery=true)
    List<Model> findEmployeesByDepartment(String department);
    }


package com.example.employeepayrollapp.model;

import com.example.employeepayrollapp.dto.EmployeeDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
public class Model {

    @Id
    @GeneratedValue
    Long employeeId;
    String employeeName;
    String profilePic;
    String department;
    Date startDate;
    String notes;
    String gender;
    Long salary;


    public Model(EmployeeDto Dto)  {
        this.employeeName = Dto.getEmployeeName();
        this.profilePic = Dto.getProfilePic();
        this.gender = Dto.getGender();
        this.salary = Dto.getSalary();
        this.department = Dto.getDepartment();
        this.startDate = Dto.getStartDate();
        this.notes = Dto.getNotes();
    }

}



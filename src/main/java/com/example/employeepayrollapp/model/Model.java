package com.example.employeepayrollapp.model;

import com.example.employeepayrollapp.dto.EmployeeDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name="employee_payroll_app_employee_payroll")
public class Model {

    @Id
    @GeneratedValue
     @Column(name="employee_id")
  private  Long employeeId;
    @Column(name="employee_name")
   private String employeeName;
   private String profilePic;
   private Date startDate;
   private String notes;
  private  String gender;
  private  Long salary;
    @ElementCollection
    @CollectionTable(name="employee_department",joinColumns=@JoinColumn(name="ID"))
    @Column(name="Department")
    private List<String> department;


    public Model(EmployeeDto Dto)  {
        this.employeeName = Dto.getEmployeeName();
        this.profilePic = Dto.getProfilePic();
        this.gender = Dto.getGender();
        this.salary = Dto.getSalary();
        this.startDate = Dto.getStartDate();
        this.notes = Dto.getNotes();
        this.department = Dto.getDepartment();
    }

}



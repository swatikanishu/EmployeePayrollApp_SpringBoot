package com.example.employeepayrollapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
public class EmployeeDto {
    String employeeName;
    String profilePic;
    String department;
    Date startDate;
    String notes;
    String gender;
    Long salary;
}

package com.example.employeepayrollapp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.util.Date;
@Data
@NoArgsConstructor
public class EmployeeDto {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message="Employee name is invalid ")
    String employeeName;
    String profilePic;
    String department;
    @NotNull(message = "startDate should Not be Empty")
    Date startDate;
    String notes;
    @NotEmpty(message = "Gender Cannot be Empty")
    String gender;
    @Min(value = 50000, message="Salary Should be More than 50000")
    Long salary;
}

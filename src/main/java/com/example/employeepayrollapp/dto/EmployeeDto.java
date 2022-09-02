package com.example.employeepayrollapp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class EmployeeDto {
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message="Employee name is invalid ")
   private String employeeName;
   private String profilePic;
    @NotNull(message = "startDate should Not be Empty")
    private   Date startDate;

    private  String notes;
    @NotEmpty(message = "Gender Cannot be Empty")
    private String gender;
    @Min(value = 50000, message="Salary Should be More than 50000")
    private Long salary;
    private List<String> department;
}

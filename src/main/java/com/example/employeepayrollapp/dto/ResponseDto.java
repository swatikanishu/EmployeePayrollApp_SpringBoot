package com.example.employeepayrollapp.dto;

import com.example.employeepayrollapp.model.Model;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseDto {
    private String message;
    public Object object;

    public ResponseDto(String string, Model response) {
        this.message = string;
        this.object = response;
    }
}
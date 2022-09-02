package com.example.employeepayrollapp.dto;

import com.example.employeepayrollapp.model.Model;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Optional;

@Data
@NoArgsConstructor
public class ResponseDto {
    private String message;
    public Object object;

    public ResponseDto(String string, Model response) {
        this.message = string;
        this.object = response;
    }
    public ResponseDto(String string, String response) {
        this.message = string;
        this.object = response;
    }
    public ResponseDto(String string, Optional<Model> response) {
        this.message = string;
        this.object = response;
    }
    public ResponseDto(String string, List<Model> response) {
        this.message = string;
        this.object = response;
    }
}
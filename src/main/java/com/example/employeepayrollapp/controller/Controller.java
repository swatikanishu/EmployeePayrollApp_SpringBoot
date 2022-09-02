package com.example.employeepayrollapp.controller;

import com.example.employeepayrollapp.dto.EmployeeDto;
import com.example.employeepayrollapp.dto.ResponseDto;
import com.example.employeepayrollapp.model.Model;
import com.example.employeepayrollapp.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class Controller {

    @Autowired

    IService service;

    @GetMapping(value = {"", "/", "/home"})
    public String emp(@RequestParam(value = "name", defaultValue = "Swatika") String name) {
        return "welcome to employee pay roll app";
    }

    @GetMapping("/service")
    public String serviceCall() {
        return service.helloMessage();
    }

    @PostMapping("/post")
    public ResponseEntity <ResponseDto> addEmpData(@Valid @RequestBody EmployeeDto empData) {
        Model response=service.saveData(empData);
        ResponseDto responseDto =new ResponseDto("Data is addded",response);
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public Optional<Model> sayHelloById(@PathVariable Long id) {
        Optional<Model> response = service.sayHelloById(id);
        return response;
    }



    @GetMapping("/allPayroll")
    public List<Model> findAllPayroll() {
        return service.findByAllPayroll();
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<ResponseDto> editId(@Valid @RequestBody EmployeeDto  empDto,@PathVariable Long id) {
        Optional<Model>emp = Optional.ofNullable(service.editPayroll(empDto, id));
        ResponseDto responseDto = new ResponseDto("  Data edited successfully  ", emp);
        return new ResponseEntity<>(responseDto, HttpStatus.ACCEPTED);


    }
    @DeleteMapping("/delete/{id}")
    public String deletePayroll(@PathVariable Long id) {
        service.deletePayroll(id);
        return "Message Deleted";
    }
    @GetMapping("/department/{department}")
    public ResponseEntity <ResponseDto> getEmployeeDataByDepartment(@PathVariable String department) {
        List<Model> empDataList = service.getEmployeesByDepartment(department);
        ResponseDto respDTO = new ResponseDto("Get Data By Department", empDataList);
        return new ResponseEntity<>(respDTO, HttpStatus.OK);
    }

}




package br.com.zup.dp.web.controller;

import br.com.zup.dp.data.entity.Employee;
import br.com.zup.dp.data.to.EmployeeTo;
import br.com.zup.service.api.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping(value = "employee", consumes = "application/json", produces = "application/json")
    public EmployeeTo save(@RequestBody EmployeeTo employeeTo){
        return employeeService.save(employeeTo);
    }
}

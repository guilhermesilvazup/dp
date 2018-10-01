package br.com.zup.service.impl;

import br.com.zup.dp.data.entity.Employee;
import br.com.zup.dp.data.to.EmployeeTo;
import br.com.zup.dp.repository.EmployeeRepository;
import br.com.zup.service.api.EmployeeService;
import br.com.zup.service.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public EmployeeTo save(EmployeeTo employeeTo) {
        Employee employee = employeeMapper.EmployeeTotoEmployee(employeeTo);
        employeeRepository.save(employee);
        employeeTo = employeeMapper.EmployeetoEmployeeTo(employee);
        return employeeTo;
    }
}

package br.com.zup.service.mapper;

import br.com.zup.dp.data.entity.Employee;
import br.com.zup.dp.data.to.EmployeeTo;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface EmployeeMapper {
    EmployeeTo EmployeetoEmployeeTo(Employee employee);
    Employee EmployeeTotoEmployee(EmployeeTo employeeTo);
}

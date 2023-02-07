package com.bajaj.Project.service;
import java.util.List;
import com.bajaj.Project.model.Employee;
public interface EmployeeService {

    List < Employee > getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}

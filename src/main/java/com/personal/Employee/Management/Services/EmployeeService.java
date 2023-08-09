package com.personal.Employee.Management.Services;

import com.personal.Employee.Management.Models.Employee;
import com.personal.Employee.Management.Repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeService {
    public IEmployeeRepo iEmployeeRepo;

    @Autowired
    public EmployeeService(IEmployeeRepo iEmployeeRepo){
        this.iEmployeeRepo= iEmployeeRepo;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return iEmployeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return iEmployeeRepo.findAll();
    }

    public Optional<Employee> findEmployeeById(long id){
        return iEmployeeRepo.findById(id);
    }

    public Employee updateEmployee(Employee employee){
        return iEmployeeRepo.save(employee);
    }

    public void deleteEmployee(long id){
        iEmployeeRepo.deleteById(id);
    }
}

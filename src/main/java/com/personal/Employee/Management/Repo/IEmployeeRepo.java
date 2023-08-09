package com.personal.Employee.Management.Repo;

import com.personal.Employee.Management.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepo extends JpaRepository<Employee,Long> {
}

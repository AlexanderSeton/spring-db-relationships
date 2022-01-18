package com.codeclan.example.JobService.repositories;

import com.codeclan.example.JobService.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

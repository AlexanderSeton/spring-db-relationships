package com.codeclan.example.JobService.repositories;

import com.codeclan.example.JobService.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

package com.codeclan.example.JobService;

import com.codeclan.example.JobService.models.Department;
import com.codeclan.example.JobService.models.Employee;
import com.codeclan.example.JobService.models.Project;
import com.codeclan.example.JobService.repositories.DepartmentRepository;
import com.codeclan.example.JobService.repositories.EmployeeRepository;

import com.codeclan.example.JobService.repositories.ProjectRepository;
import org.hibernate.annotations.SourceType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class JobServiceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployee() {
		Department department = new Department("test department");
		departmentRepository.save(department);
		Employee employee1 = new Employee("John", "Smith", 54534, department);
		employeeRepository.save(employee1);
		Project project1 = new Project("project 1", 30);
		List<Employee> project1Employee = new ArrayList<>();
		project1Employee.add(employee1);
		project1.setEmployees(project1Employee);
		projectRepository.save(project1);
	}
}

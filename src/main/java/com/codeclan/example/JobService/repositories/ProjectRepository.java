package com.codeclan.example.JobService.repositories;

import com.codeclan.example.JobService.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}

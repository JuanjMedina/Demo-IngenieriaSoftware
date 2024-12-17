package com.example.demoingsoftware.repository;

import com.example.demoingsoftware.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

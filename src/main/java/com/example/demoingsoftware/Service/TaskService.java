package com.example.demoingsoftware.Service;


import com.example.demoingsoftware.Dto.TaskDTO;

import java.util.List;

public interface TaskService {
    List<TaskDTO> getAllTasks();
    TaskDTO createTask(TaskDTO dto);
}
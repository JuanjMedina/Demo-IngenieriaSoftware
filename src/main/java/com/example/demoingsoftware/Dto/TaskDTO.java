package com.example.demoingsoftware.Dto;

import lombok.Data;

@Data
public class TaskDTO {
    private Long id;
    private String title;
    private String description;
    private Long userId;
}
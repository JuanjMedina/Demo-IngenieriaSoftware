package com.example.demoingsoftware.Service;

import com.example.demoingsoftware.Dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO registerUser(UserDTO userDTO);
    List<UserDTO> getAllUsers();
}
package com.example.demoingsoftware.repository;
import com.example.demoingsoftware.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

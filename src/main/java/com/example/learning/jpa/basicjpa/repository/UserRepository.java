package com.example.learning.jpa.basicjpa.repository;

import com.example.learning.jpa.basicjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

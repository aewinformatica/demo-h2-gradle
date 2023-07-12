package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface UserRepository  extends JpaRepository<User, Long>{
public Optional<User> findByName(String name);
public Page<User> findByNameContaining(String name, Pageable pageable);
}

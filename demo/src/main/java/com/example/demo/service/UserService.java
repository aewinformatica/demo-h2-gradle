package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public Optional<User> findByName(String name){
		return userRepository.findByName(name); 	
	}
	
	public User create(User user){
		
		return userRepository.save(user);
	}
	
}

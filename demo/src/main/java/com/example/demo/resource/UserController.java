package com.example.demo.resource;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.utils.ErrorResponse;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
		
	@PostMapping
	public ResponseEntity<?> create(@RequestBody User user){
		
		Optional<User> userFinded = userService.findByName(user.getName());
		if(userFinded.isPresent()) {
			Map<String, Object> details = new HashMap<>();
			details.put("usuario",userFinded);
			
			ErrorResponse errorResponse = new ErrorResponse(400,"usuario com cadastro existente",details );
			return ResponseEntity.badRequest().body(errorResponse);
		}
		return ResponseEntity.ok().body(userService.create(user));
	}
	
}


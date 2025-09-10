package com.google.linkedin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.linkedin.entity.User;
import com.google.linkedin.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@PostMapping("/users")
	public ResponseEntity<?> sveUser(@RequestBody User u){
		return service.saveUser(u);	
		}
	
	@GetMapping("/users")
	public ResponseEntity<?> findAllUsers(){
		return service.findAllUsers();
	}
	
	
	@GetMapping("/users/{id}")
	public ResponseEntity<?> findUserById(@PathVariable int id){
		return service.findUserById(id);
	}
	
	@GetMapping("/user/name/(name)")
	public ResponseEntity<?> findUserByName(String name){
		return service.findUserByName(name);
	}
}
 
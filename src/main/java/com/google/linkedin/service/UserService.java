package com.google.linkedin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.google.linkedin.dao.UserDao;
import com.google.linkedin.entity.User;
import com.google.linkedin.responsestructure.ResponseStructure;

@Service
public class UserService {
	
	@Autowired
	UserDao dao;

	public ResponseEntity<?> saveUser(User u) {
		User savedUser = dao.saveUSer(u);
		ResponseStructure rs = new ResponseStructure (201, "User Saved Successfully", savedUser);
		return ResponseEntity.status(201).body(rs);
		
	}

	public ResponseEntity<?> findAllUsers() {
		List<User> ul = dao.findAllUsers();
		ResponseStructure rs = new ResponseStructure();
		rs.setStatus(200);
		rs.setMessage("All User Find Successfully");
		rs.setBody(ul);
		
		return ResponseEntity.status(200).body(rs);
	}

	public ResponseEntity<?> findUserById(int id) {
		Optional<User> optional = dao.findUserById(id);

		if (optional.isPresent()) {
			User user = optional.get();
			ResponseStructure rs = new ResponseStructure();
			rs.setStatus(200);
			rs.setMessage("User Found Successfully");
			rs.setBody(user);
			return ResponseEntity.status(200).body(rs);
		} else {
			ResponseStructure rs = new ResponseStructure();
			rs.setStatus(404);
			rs.setMessage("Invalid User Id, Unable to find User");
			rs.setBody(null);
			return ResponseEntity.status(404).body(rs);
		}

		
	}

	public ResponseEntity<?> findUserByName(String name) {
		return null;
	}
}
package com.google.linkedin.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.linkedin.entity.User;
import com.google.linkedin.repository.UserRepository;

@Repository
public class UserDao {

	
		@Autowired
		UserRepository repository;

		public User saveUSer(User u) {
			
			return repository.save(u);
		}

		public List<User> findAllUsers() {
		
			return repository.findAll();
		}

		public Optional<User> findUserById(int id) {
			return repository.findById(id);
			
		}
		
}

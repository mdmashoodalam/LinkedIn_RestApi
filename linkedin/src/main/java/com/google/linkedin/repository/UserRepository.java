package com.google.linkedin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.google.linkedin.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	//method name convenction
	List<User> findByName(String Name);
	
	//custome Query
	//@Query("select u from User u where u.name=?1 ")
	//List<User> findUserByName(String name);

	
}

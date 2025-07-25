package com.google.linkedin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.linkedin.entity.Education;
import com.google.linkedin.service.EducationService;
@RestController
public class EducationController {
	
	@Autowired
	EducationService service;
	
	@PostMapping("/educations/{uid}")
	public ResponseEntity<?> saveEducation(@RequestBody Education e, @PathVariable int uid){
		return service.saveEducation(e, uid);
	}
	


}

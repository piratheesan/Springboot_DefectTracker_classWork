package com.pirathee.DefectTracker_SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import com.pirathee.DefectTracker_SpringBoot.model.Project;
import com.pirathee.DefectTracker_SpringBoot.repository.ProjectRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Project_Controller {
	
	@Autowired
	ProjectRepository projectRepository;
	
	@PostMapping(value="/project")
	public ResponseEntity<?> saveProject(@RequestBody Project project){
		projectRepository.save(project);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@GetMapping(value="/project")
	public List<Project> getProject(){
		return projectRepository.findAll();
	}

}

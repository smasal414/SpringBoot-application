package com.intelizign.springbootnew.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intelizign.springbootnew.Repositories.ProjectRepository;



@Service
public class ProjectService {

	
	@Autowired
public 	ProjectRepository projectRepository;
	
	
}

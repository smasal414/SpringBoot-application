package com.intelizign.springbootnew.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intelizign.springbootnew.Repositories.RoleRepository;

@Service
public class RoleService {

	
	@Autowired
public 	RoleRepository roleRepository;
}

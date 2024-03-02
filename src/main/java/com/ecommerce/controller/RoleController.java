package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Role;
import com.ecommerce.repository.RoleRepository;

@RestController	
public class RoleController {

	@Autowired
	private RoleRepository roleRepo;

	@GetMapping("/admin/role")
	public Iterable<Role> list() {
		return roleRepo.findAll();
	}

}

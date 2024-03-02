package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Size;
import com.ecommerce.repository.SizeRepository;

@RestController
public class SizeController {

	@Autowired
	private SizeRepository sizeRepo;

	@GetMapping("/size")
	public Iterable<Size> list() {
		return sizeRepo.findAll();
	}

}

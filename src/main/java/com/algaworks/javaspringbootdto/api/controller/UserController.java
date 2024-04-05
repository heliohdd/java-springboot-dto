package com.algaworks.javaspringbootdto.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.javaspringbootdto.api.model.UserDTO;
import com.algaworks.javaspringbootdto.domain.service.UserService;


@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/{userId}")
	public UserDTO findById(@PathVariable Long userId) {
		return userService.findById(userId);
	}
	
}

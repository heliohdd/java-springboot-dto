package com.algaworks.javaspringbootdto.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.javaspringbootdto.api.model.UserDTO;
import com.algaworks.javaspringbootdto.domain.model.User;
import com.algaworks.javaspringbootdto.domain.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Transactional(readOnly = true)
	public UserDTO findById(Long id) {
		User user = userRepository.findById(id).get();
		return new UserDTO(user);
	}
	
	
}

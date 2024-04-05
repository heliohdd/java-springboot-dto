package com.algaworks.javaspringbootdto.api.model;

import com.algaworks.javaspringbootdto.domain.model.User;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDTO {

	private Long id;
	private String name;
	public UserDTO() {
	}
	public UserDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public UserDTO(User user) {
		id = user.getId();
		name = user.getName();
	}
}

package com.algaworks.javaspringbootdto.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.javaspringbootdto.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

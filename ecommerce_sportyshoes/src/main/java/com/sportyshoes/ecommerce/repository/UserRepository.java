package com.sportyshoes.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.sportyshoes.ecommerce.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
}

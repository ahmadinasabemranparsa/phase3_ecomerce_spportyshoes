package com.sportyshoes.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.sportyshoes.ecommerce.model.UserProductPurchased;

public interface UserProductPurchasedRepository extends CrudRepository<UserProductPurchased, Integer> {
	
}

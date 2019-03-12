package com.zensar.SecurityRest.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.zensar.SecurityRest.models.User;

public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String email);
}

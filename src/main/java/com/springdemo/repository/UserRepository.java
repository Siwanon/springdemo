package com.springdemo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springdemo.model.User;

public interface UserRepository extends MongoRepository<User, String>{
	
	public List<User> findById(String id);
}

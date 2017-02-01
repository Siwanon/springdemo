package com.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



import com.springdemo.model.User;
import com.springdemo.repository.UserRepository;

@RestController
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	
	@RequestMapping(value = "/api/user/findAll", method = RequestMethod.GET)
	public List<User> findAll(){
		return userRepository.findAll();
	}
}

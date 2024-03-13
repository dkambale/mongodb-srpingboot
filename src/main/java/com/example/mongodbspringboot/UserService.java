package com.example.mongodbspringboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository repo;

	public User saveUser(User user) {

		user = repo.save(user);

		return user;
	}

	public User updateUser(User user) {

		user = repo.save(user);

		return user;
	}

	public Boolean deletUser(String userId) {

		repo.deleteById(userId);
		return true;
	}

	public List<User> getALlUser() {

		return repo.findAll();
	}

}

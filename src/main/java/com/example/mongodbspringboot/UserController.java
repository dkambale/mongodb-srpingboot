package com.example.mongodbspringboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/save")
	public ResponseEntity<User> saveUser(@RequestBody User user) {

		user = userService.saveUser(user);

		return new ResponseEntity<>(user, HttpStatus.OK);

	}

	@PutMapping("/update")
	public ResponseEntity<User> updateUser(@RequestBody User user) {

		user = userService.updateUser(user);

		return new ResponseEntity<>(user, HttpStatus.OK);

	}

	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<Boolean> deleteUser(@PathVariable String userId) {

		Boolean isDeleted = userService.deletUser(userId);

		return new ResponseEntity<>(isDeleted, HttpStatus.OK);

	}

	@GetMapping("/getList")
	public ResponseEntity<List<User>> getAllUser() {

		List<User> users = userService.getALlUser();

		return new ResponseEntity<>(users, HttpStatus.OK);

	}
}

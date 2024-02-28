package com.SpringBootApp.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootApp.demo.Model.User;
import com.SpringBootApp.demo.Service.UserServiceImpl;

@RestController
public class UserController {

	  @Autowired
	    private UserServiceImpl userService;

	    @PostMapping("/users")
	    public User createUser(@RequestBody User user) {
	        user.setPassword(userService.generatePassword(user.getFirstName(), user.getMiddleName(), user.getLastName()));
	        return userService.saveUser(user);
	    }
}

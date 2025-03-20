package com.mayank.LMSBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mayank.LMSBackend.model.User;
import com.mayank.LMSBackend.repository.UserRepository;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	@PostMapping()
	public User RegisterUser(@RequestBody User thisuser) {
		return userRepo.save(thisuser);
	}
	
	@PostMapping("/login")
	public Boolean LoginUser(@RequestBody User mainUser) {
		System.out.println(mainUser.getEmail());
		User tempuser = userRepo.findByEmail(mainUser.getEmail());
		if(tempuser == null) return false;
		
		System.out.println(tempuser);
		if(tempuser.getEmail().equals(mainUser.getEmail()))
			return true;
		return false;
	}
}

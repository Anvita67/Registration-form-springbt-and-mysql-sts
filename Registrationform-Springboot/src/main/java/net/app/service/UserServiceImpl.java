package net.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.app.entity.User;
import net.app.repo.UserRepo;


@Service
public abstract class UserServiceImpl implements UserService{
	
	
	@Autowired
	private UserRepo repo;
	
	@Override
	public void registerUser(User user) {
		
		repo.save(user);
	}
	}



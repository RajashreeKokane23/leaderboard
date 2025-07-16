package com.leadboard.Service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leadboard.RepositryI.Claimhistoryrepositary;
import com.leadboard.RepositryI.UserrepositaryI;
import com.leadboard.model.Claimhistory;
import com.leadboard.model.User;
	@Service
	public class Userservice {
	    @Autowired 
	    private UserrepositaryI userRepo;
	    
	    @Autowired 
	    private Claimhistoryrepositary historyRepo;

	    public List<User> getUsers() {
	        return userRepo.findAllByOrderByTotalPointsDesc();
	    }

	    public User addUser(String name) {
	        User user = new User();
	        user.setName(name);
	        
	        return userRepo.save(user);
	    }

	   
	}




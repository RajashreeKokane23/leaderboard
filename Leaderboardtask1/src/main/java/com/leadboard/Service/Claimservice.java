package com.leadboard.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leadboard.RepositryI.Claimhistoryrepositary;
import com.leadboard.RepositryI.UserrepositaryI;
import com.leadboard.model.Claimhistory;
import com.leadboard.model.User;

@Service
	public class Claimservice {
	    @Autowired private UserrepositaryI userRepository;
	    @Autowired private Claimhistoryrepositary claimHistoryRepository;

	    public Claimhistory claimPoints(Long userId) {
	        int points = new Random().nextInt(10) + 1;
	        User user = userRepository.findById(userId).orElseThrow();
	        user.setTotalPoints(user.getTotalPoints() + points);
	        userRepository.save(user);

	        Claimhistory history = new Claimhistory();
	        history.setId(userId);
	        history.setPoints(points);
	        history.setTimestamp(LocalDateTime.now());
	        return claimHistoryRepository.save(history);
	    }

	    public List<Claimhistory> getHistory() {
	        return claimHistoryRepository.findAll();
	    }
	}



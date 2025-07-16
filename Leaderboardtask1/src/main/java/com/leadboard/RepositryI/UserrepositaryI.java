package com.leadboard.RepositryI;

import java.util.List;

import com.leadboard.model.User;

public interface UserrepositaryI {
	 List<User> findAllByOrderByTotalPointsDesc();

	User save(User user);

	Object findById(Long userId);

	
	}



package com.leadboard.RepositryI;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leadboard.model.Claimhistory;

public interface Claimhistoryrepositary extends JpaRepository<Claimhistory, Long>{
	List<Claimhistory> findByUserId(Long userId);
}

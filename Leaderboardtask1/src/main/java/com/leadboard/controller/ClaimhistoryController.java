package com.leadboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.leadboard.RepositryI.Claimhistoryrepositary;
import com.leadboard.model.Claimhistory;

public class ClaimhistoryController {
	@Autowired private Claimhistoryrepositary repo;

    @GetMapping
    public List<Claimhistory> getAll() {
        return repo.findAll();
}
}
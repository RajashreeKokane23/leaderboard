package com.leadboard.controller;


	package com.leadboard.controller;

	import java.util.List;
	import java.util.Map;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;

	import com.leadboard.Service.Userservice;
	import com.leadboard.model.Claimhistory;
	import com.leadboard.model.User;

	@RestController
	@RequestMapping("/api/users")
	public class Usercontroller {

	    @Autowired
	    private Userservice service;

	    @GetMapping
	    public List<User> getUsers() {
	        return service.getUsers();
	    }

	    @PostMapping
	    public User addUser(@RequestBody Map<String, String> body) {
	        return service.addUser(body.get("name"));
	    }

	    @PostMapping("/claim/{id}")
	    public Claimhistory claimPoints(@PathVariable String id) {
	        return service.claimPoints(id);
	    }
	}



package com.sclabs.TestingFakeMongoWebserver.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sclabs.TestingFakeMongoWebserver.model.PermissionModel;
import com.sclabs.TestingFakeMongoWebserver.service.PermissionService;



@RestController
public class PermissionControllerRoutes {
	
	@Autowired
	PermissionService permissionService;
	
	@PostMapping(path = "/members", consumes = "application/json", produces = "application/json")
	public PermissionModel savePermission( @RequestBody PermissionModel permission ) {
		return permissionService.savePermission(permission);
		
	}     
	

}       


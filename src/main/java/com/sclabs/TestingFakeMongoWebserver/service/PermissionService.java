package com.sclabs.TestingFakeMongoWebserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sclabs.TestingFakeMongoWebserver.dao.PermissionRepository;
import com.sclabs.TestingFakeMongoWebserver.model.PermissionModel;

@Service
public class PermissionService {
	
	@Autowired
	PermissionRepository permissionRepository;
	
	public PermissionModel savePermission(PermissionModel permission) {
		return permissionRepository.savePermission(permission);
	}

}

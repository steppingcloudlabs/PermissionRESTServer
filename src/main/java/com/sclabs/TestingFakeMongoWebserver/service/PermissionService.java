package com.sclabs.TestingFakeMongoWebserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.sclabs.TestingFakeMongoWebserver.dao.PermissionRepository;
import com.sclabs.TestingFakeMongoWebserver.model.PermissionModel;

@Service
public class PermissionService {

	@Autowired
	PermissionRepository permissionRepository;

	public PermissionModel savePermission(PermissionModel permission) {
		return permissionRepository.savePermission(permission);
	}

	public PermissionModel getPermission(String permission) {
		return permissionRepository.getPermission(permission);
	}

	public PermissionModel getPermissionByProductName(String permission, String Productname) {
		return permissionRepository.getPermissionByProductName(permission, Productname);
	}

	public List<PermissionModel> getAllPermission() {
		return permissionRepository.getAllPermission();
	}

	public PermissionModel savebulkPermission(PermissionModel permission) {
		return permissionRepository.saveBulkPermission(permission);
	}

	public PermissionModel updatePermissionByName(PermissionModel permission) {
		return permissionRepository.updatePermissionByName(permission);
	}

	public PermissionModel updatePermissionByValue(PermissionModel permission) {
		return permissionRepository.updatePermissionByValue(permission);
	}
	public PermissionModel updatePermissionByProductName(PermissionModel permission) {
		return permissionRepository.updatePermissionByProductName(permission);
	}

	public void deleteAll() {
		permissionRepository.deleteAll();
	}

	public void deletePermissionByProductName(PermissionModel permissionModel) {
		permissionRepository.deletePermissionByProductName(permissionModel);
	}

}

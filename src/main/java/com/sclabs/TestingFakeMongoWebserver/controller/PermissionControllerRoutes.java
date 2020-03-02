package com.sclabs.TestingFakeMongoWebserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.sclabs.TestingFakeMongoWebserver.model.PermissionModel;
import com.sclabs.TestingFakeMongoWebserver.service.PermissionService;

@RestController
public class PermissionControllerRoutes {

	@Autowired
	PermissionService permissionService;

	@PostMapping(path = "/savepermission", produces = "application/json")
	public PermissionModel savePermission(@RequestBody PermissionModel permission) {
		return permissionService.savePermission(permission);

	}

	@GetMapping(path = "/getpermission", produces = "application/json")
	public PermissionModel getPermission(@RequestParam String permission) {
		return permissionService.getPermission(permission);

	}

	@GetMapping(path = "/getpermissionbyproductname", produces = "application/json")
	public PermissionModel getPermissionByProductName(@RequestParam String permission,
			@RequestParam String servicename) {
		return permissionService.getPermissionByProductName(permission, servicename);

	}

	@GetMapping(path = "/getallpermission", produces = "application/json")
	public List<PermissionModel> getAllPermission() {
		return permissionService.getAllPermission();

	}

	@PostMapping(path = "/savebulkpermission", produces = "application/json")
	public PermissionModel savebulkPermission(@RequestBody PermissionModel permissionbulk) {
		return permissionService.savebulkPermission(permissionbulk);

	}

	@PutMapping(path = "/updatepermission", produces = "application/json")
	public PermissionModel updatePermission(@RequestBody PermissionModel permissionbulk) {
		return permissionService.updatePermission(permissionbulk);

	}

}

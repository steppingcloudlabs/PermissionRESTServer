package com.sclabs.TestingFakeMongoWebserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@PutMapping(path = "/updateByName", produces = "application/json")
	public PermissionModel updatePermissionByName(@RequestBody PermissionModel permission) {
		return permissionService.updatePermissionByName(permission);
	}

	@PutMapping(path = "/updateByValue", produces = "application/json")
	public PermissionModel updatePermissionByValue(@RequestBody PermissionModel permission) {
		return permissionService.updatePermissionByValue(permission);
	}

	@PutMapping(path = "/updateByProductName", produces = "application/json")
	public PermissionModel updatePermissionByProductName(@RequestBody PermissionModel permission) {
		return permissionService.updatePermissionByProductName(permission);
	}

	@DeleteMapping(value = "/deleteAll", produces = "application/json")
	public void deleteAll() {
		permissionService.deleteAll();
	}

	@DeleteMapping(value = "/deletebyProductName", produces = "application/json")
	void deletePermissionByProductName(@RequestBody PermissionModel permissionModel){
		permissionService.deletePermissionByProductName(permissionModel);
	}
}

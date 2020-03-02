package com.sclabs.TestingFakeMongoWebserver.dao;

import java.util.List;

import com.sclabs.TestingFakeMongoWebserver.model.PermissionModel;

public interface CustomPermissionRepository {

	// READ OPERATIONS

	PermissionModel getPermission(String PermissionName);

	PermissionModel getPermissionByProductName(String permissionName, String ServiceName);

	List<PermissionModel> getAllPermission();

	PermissionModel getAllPermissionByProductName(String ServiceName);

	// Pagination in READ OPERATIONS
	PermissionModel getAllPermissionByPage(int PageNumber, int PageSize);

	PermissionModel getAllPermissionByProductNameByPage(String ServiceName, int PageNumber, int PageSize);

	// WRITE OPERATION
	PermissionModel savePermission(PermissionModel permissionModel);

	void saveBulkPermission(PermissionModel permissionModel);

	void saveBulkPermissionByProductName(List<PermissionModel> permissionModel, String ServiceName);

	// UPDATE OPERATION
	void updatePermission(PermissionModel permissionModel);

	void updatePermissionByProductName(PermissionModel permissionModel);

	void updateBulkPermission(List<PermissionModel> permissionModels);

	void updateBulkPermissionByProductName(List<PermissionModel> permissionModels, String ServiceName);

	// DELETE OPERATION
	void deleteAll();

	void deletePermissionByProductName(PermissionModel permissionModel, String ServiceName);

	void deleteBulkPermissionByProductName(List<PermissionModel> permissionModels, String ServiceName);

}

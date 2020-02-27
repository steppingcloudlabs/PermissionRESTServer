package com.sclabs.TestingFakeMongoWebserver.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.sclabs.TestingFakeMongoWebserver.model.PermissionModel;

public class PermissionDataAccessLayerMongoDbImplementation implements PermissionDataAccessLayer {
	
	private final MongoTemplate mongoTemplate;

	@Autowired
	public PermissionDataAccessLayerMongoDbImplementation(MongoTemplate mongoTemplate) {
		// TODO Auto-generated constructor stub
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public PermissionModel getPermission(String PermissionName) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public PermissionModel getPermissionByProductName(String ermissionName, String ServiceName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PermissionModel getAllPermission() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PermissionModel getAllPermissionByProductName(String ServiceName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PermissionModel getAllPermissionByPage(int PageNumber, int PageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PermissionModel getAllPermissionByProductNameByPage(String ServiceName, int PageNumber, int PageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PermissionModel savePermission(PermissionModel permissionName) {
		mongoTemplate.save(permissionName);
		return permissionName;

	}


	@Override
	public void saveBulkPermission(PermissionModel permissionModel) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveBulkPermissionByProductName(List<PermissionModel> permissionModel, String ServiceName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePermission(PermissionModel permissionModel) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePermissionByProductName(PermissionModel permissionModel) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBulkPermission(List<PermissionModel> permissionModels) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBulkPermissionByProductName(List<PermissionModel> permissionModels, String ServiceName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePermissionByProductName(PermissionModel permissionModel, String ServiceName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBulkPermissionByProductName(List<PermissionModel> permissionModels, String ServiceName) {
		// TODO Auto-generated method stub

	}

}

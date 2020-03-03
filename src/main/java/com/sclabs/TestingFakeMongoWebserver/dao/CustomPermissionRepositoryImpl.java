package com.sclabs.TestingFakeMongoWebserver.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mongodb.client.MongoCollection;
import com.sclabs.TestingFakeMongoWebserver.model.PermissionModel;

public class CustomPermissionRepositoryImpl implements CustomPermissionRepository {

	private final MongoTemplate mongoTemplate;

	@Autowired
	public CustomPermissionRepositoryImpl(MongoTemplate mongoTemplate) {
		// TODO Auto-generated constructor stub
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public PermissionModel getPermission(String PermissionName) {
		// TODO Auto-generated method stub
		Query query = new Query().addCriteria(Criteria.where("permissionName").is(PermissionName));
		return mongoTemplate.findOne(query, PermissionModel.class);
	}

	@Override
	public PermissionModel getPermissionByProductName(String permissionName, String ServiceName) {
		// TODO Auto-generated method stub
		Query query = new Query().addCriteria(new Criteria().andOperator(
				Criteria.where("permissionName").is(permissionName), Criteria.where("productName").is(ServiceName)));
		return mongoTemplate.findOne(query, PermissionModel.class);
	}

	@Override
	public List<PermissionModel> getAllPermission() {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(PermissionModel.class);
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
	public PermissionModel savePermission(PermissionModel permissionModel) {
		// TODO Auto-generated method stub
		mongoTemplate.save(permissionModel);
		return permissionModel;
	}

	@Override
	public PermissionModel saveBulkPermission(PermissionModel permissionModel) {
		// TODO Auto-generated method stub
		mongoTemplate.save(permissionModel);
		return permissionModel;

	}

	@Override
	public void saveBulkPermissionByProductName(List<PermissionModel> permissionModel, String ServiceName) {
		// TODO Auto-generated method stub

	}

	@Override
	public PermissionModel updatePermissionByName(PermissionModel permissionModel) {
		
		String productName=permissionModel.getProductName();
		String permissionName=permissionModel.getPermissionName();
		String permissionValue=permissionModel.getPermissionValue();
		
		Query query = new Query().addCriteria(new Criteria().andOperator(
				Criteria.where("productName").is(productName), Criteria.where("permissionValue").is(permissionValue)));
		
		PermissionModel obj=mongoTemplate.findOne(query, PermissionModel.class);
		obj.setPermissionName(permissionName);
		mongoTemplate.save(obj);
		return obj;
		// TODO Auto-generated method stub

	}

	@Override
	public PermissionModel updatePermissionByValue(PermissionModel permissionModel) {
		
		String productName=permissionModel.getProductName();
		String permissionName=permissionModel.getPermissionName();
		String permissionValue=permissionModel.getPermissionValue();
		
		Query query = new Query().addCriteria(new Criteria().andOperator(
				Criteria.where("productName").is(productName), Criteria.where("permissionName").is(permissionName)));
		
		PermissionModel obj=mongoTemplate.findOne(query, PermissionModel.class);
		obj.setPermissionValue(permissionValue);
		mongoTemplate.save(obj);
		return obj;
		// TODO Auto-generated method stub

	}

	@Override
	public PermissionModel updatePermissionByProductName(PermissionModel permissionModel) {
		// TODO Auto-generated method stub
		String productName=permissionModel.getProductName();
		String permissionName=permissionModel.getPermissionName();
		String permissionValue=permissionModel.getPermissionValue();
		
		Query query = new Query().addCriteria(new Criteria().andOperator(
				Criteria.where("permissionValue").is(permissionValue), Criteria.where("permissionName").is(permissionName)));
		
		PermissionModel obj=mongoTemplate.findOne(query, PermissionModel.class);
		obj.setProductName(productName);
		mongoTemplate.save(obj);
		return obj;

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
		//MongoClient mongoClient = new MongoClient(new ServerAddress("localhost", 27017));
    	//MongoDatabase db = mongoClient.getDatabase("test");
    	//MongoCollection collection = db.getCollection("test_collection");
		//collection.drop()
		Query query = new Query();
		mongoTemplate.findAllAndRemove(query, PermissionModel.class);
	}

	@Override
	public void deletePermissionByProductName(PermissionModel permissionModel) {
		// TODO Auto-generated method stub
		String productName=permissionModel.getProductName();
		Query query = new Query().addCriteria(Criteria.where("productName").is(productName));
		mongoTemplate.remove(query, PermissionModel.class);

	}

	@Override
	public void deleteBulkPermissionByProductName(List<PermissionModel> permissionModels, String ServiceName) {
		// TODO Auto-generated method stub

	}

}

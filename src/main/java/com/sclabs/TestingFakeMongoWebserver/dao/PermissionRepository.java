package com.sclabs.TestingFakeMongoWebserver.dao;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sclabs.TestingFakeMongoWebserver.model.PermissionModel;

@Repository
public interface PermissionRepository extends MongoRepository<PermissionModel, String>, CustomPermissionRepository{
	
}
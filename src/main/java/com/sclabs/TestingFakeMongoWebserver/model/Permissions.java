/**
 * 
 */
package com.sclabs.TestingFakeMongoWebserver.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author prakritidevverma
 *
 */
@Document
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Permissions {

	/**
	 * This class holds the schema for collection "Permission" 
	 * All the fine grained permission will be stored here which 
	 * will be refereed by Roles and groups.
	 */
	
	@Id
	ObjectId id;
	String productName;
	String permissionName;
	String permissionValue;
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getPermissionName() {
		return permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	public String getPermissionValue() {
		return permissionValue;
	}
	public void setPermissionValue(String permissionValue) {
		this.permissionValue = permissionValue;
	}
	public Permissions(String productName, String permissionName, String permissionValue) {
		super();
		this.productName = productName;
		this.permissionName = permissionName;
		this.permissionValue = permissionValue;
	}
	@Override
	public String toString() {
		return "Permissions [id=" + id + ", productName=" + productName + ", permissionName=" + permissionName
				+ ", permissionValue=" + permissionValue + "]";
	}
	
	

}

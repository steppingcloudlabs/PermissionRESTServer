/**
 * 
 */
package com.sclabs.TestingFakeMongoWebserver.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;


/**
 * @author prakritidevverma
 *
 */
@Document
@Data
@AllArgsConstructor
public class PermissionModel {

	/**
	 * This class holds the schema for collection "Permission" All the fine grained
	 * permission will be stored here which will be refereed by Roles and groups.
	 */

	@Id
	ObjectId id;
	String productName;
	@UniqueElements
	String permissionName;
	String permissionValue;

	@Id
	@JsonSerialize(using = ToStringSerializer.class)
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

	public PermissionModel(String productName, String permissionName, String permissionValue) {
		super();
		this.productName = productName;
		this.permissionName = permissionName;
		this.permissionValue = permissionValue;
	}

	public PermissionModel() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		try {
			return new com.fasterxml.jackson.databind.ObjectMapper().writerWithDefaultPrettyPrinter()
					.writeValueAsString(this);
		} catch (final com.fasterxml.jackson.core.JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

}

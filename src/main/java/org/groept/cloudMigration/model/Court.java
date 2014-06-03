package org.groept.cloudMigration.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
public class Court
{
	
	
	@Id
    private ObjectId id;

	private String name;

	private String introduction;

	private Set<ObjectId> capabilities;

	@DBRef (lazy = true)
	private Hall hall;

	
	public Court(String name, String introduction) {
		
		this.name = name;
		this.introduction = introduction;
		
	}
	
	

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}
 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public void unsetIntroduction() {
		this.introduction = "";	
	}
	
	public void unsetId() {
		this.id = null;	
	}
	 
	
	public Hall getHall() {
		return hall;
	}

	public void setHall(Hall hall) {
		this.hall = hall;
	}
	
	
	public Set<ObjectId> getCapabilities() {
		if(capabilities == null) {
			this.capabilities = new HashSet<ObjectId>();
		}
		return capabilities;
	}

	public void setCapabilities(Set<ObjectId> capabilities) {
		this.capabilities = capabilities;
	}

	public void addCapability(Capability capability)
	{
		if(capabilities == null) {
			this.capabilities = new HashSet<ObjectId>();
		}
		capabilities.add(capability.getId());
	}
	


	public Court(){
		
	}
	
	
}


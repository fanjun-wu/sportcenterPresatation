package org.groept.cloudMigration.model;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
public class Admin extends Person
{
	
	private String privilege;	
	private ObjectId hallId;
	
	public ObjectId getHallId() {
		if(hallId==null)
		{
			hallId=new ObjectId();
		}
		return hallId;
	}


	public void setHallId(ObjectId hallId) {
		this.hallId = hallId;
	}


	public String getPrivilege() {
		return privilege;
	}


	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}


	
	public void unsetPrivilege() {
		this.privilege = "";	
	}
	

	public Admin( String name, String email, String telephone,
			String gender, int age,String privilege) {
		super( name, email, telephone, gender, age);
		this.privilege=privilege;
		// TODO Auto-generated constructor stub
	}
	
	public Admin(){
		
	}


	@Override
	public String toString()
	{
		
		return ""+getName()+" "+getEmail()+" "+getTelephone()+" "+getGender()+" "+getAge()+" "+getPrivilege();
		
	}

	
}


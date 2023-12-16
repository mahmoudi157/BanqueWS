package com.banquews.app.document;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.*;

@Document
@Getter
@Setter
public class Account {
    @Id
    //@NotBlank(message = "saiser id correct")
	private String id ;
    public void setId(String id) {
		this.id = id;
	}
	
	private String fullName;
	
	private double solde;
	
	private Date dateCreate;
	
	
	
	
	
	
	public String getId() {
		return id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Date getDateCreate() {
		return dateCreate;
	}
	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}
	
	
	
}

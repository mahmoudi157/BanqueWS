package com.BanqueWs.entitys;

import java.util.Date;




import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Entity;

@Entity
@Getter
@Setter
public class Account {
    @Id
    //@NotBlank(message = "saiser id correct")
	private Long id ;
    public void setId(Long id) {
		this.id = id;
	}
	@NotBlank(message = "saiser fullName correct")
	private String fullName;
	
	private double solde;
	
	private Date dateCreate;
	
	
	
	
	
	
	public Long getId() {
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

package com.model2;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name="Trainee2")
@AttributeOverrides({@AttributeOverride(name="id", column = @Column(name="id")),
	  @AttributeOverride(name="name", column = @Column(name="name"))
})
public class Trainee2 extends Employee {
	private float payperhour;
	private String contractperiod;
	
	
	
	public Trainee2(float payperhour, String contractperiod, String name) {
		super(name);
		this.payperhour = payperhour;
		this.contractperiod = contractperiod;
	}
	public float getPayperhour() {
		return payperhour;
	}
	public void setPayperhour(float payperhour) {
		this.payperhour = payperhour;
	}
	public String getContractperiod() {
		return contractperiod;
	}
	public void setContractperiod(String contractperiod) {
		this.contractperiod = contractperiod;
	}
	

}

package com.model3;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="address121")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 int addrid;
	 String line1, line2, city, state;
	 int pin;
	 @OneToOne
	 Employee emp;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public Address(String line1, String line2, String city, String state, int pin) {
		super();
		//this.addrid = addrid;
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}
	public int getAddrid() {
		return addrid;
	}
	public void setAddrid(int addrid) {
		this.addrid = addrid;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
}
	
	 
	
package com.model2;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.persistence.Inheritance;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;


@Entity
@Table(name="EmpData102")
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name="category", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="general")

public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 int id;
	 String name;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(String name) {
		super();
		this.name = name;
	}
	

}

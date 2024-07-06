package com.model2;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="RegEmp2")
//@DiscriminatorValue(value="regular")
@AttributeOverrides({@AttributeOverride(name="id", column = @Column(name="id")),
					  @AttributeOverride(name="name", column = @Column(name="name"))
})
public class RegEmp2 extends Employee 
{
	private float salary;
	private int bonus;
	public RegEmp2(float salary, int bonus,String name) {
		super(name);
		this.salary = salary;
		this.bonus = bonus;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
}
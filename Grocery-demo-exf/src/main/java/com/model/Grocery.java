package com.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="product")
public class Grocery {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sno")
	private int sno;
	@Column(name="pname")
	private String pname;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	@Column(name="quantity")
	private int quantity;
	@Column(name="price")
	private float price;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setName(int quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Grocery() {
		// TODO Auto-generated constructor stub
	}
	}
package com.tqpp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private int pid;
	private String pname;
	private int price;
	private String pdesc;
	private int stockinhand;
	
	
	public Product(String pname, int price, String pdesc, int stockinhand) {
		super();
		this.pname = pname;
		this.price = price;
		this.pdesc = pdesc;
		this.stockinhand = stockinhand;
	}
	public int getStockinhand() {
		return stockinhand;
	}
	public void setStockinhand(int stockinhand) {
		this.stockinhand = stockinhand;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pname, int price, String pdesc) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.pdesc = pdesc;
		
		}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", pdesc=" + pdesc + ", stockinhand="
				+ stockinhand + "]";
	}
	public Product(String pname, int price, String pdesc) {
		super();
		this.pname = pname;
		this.price = price;
		this.pdesc = pdesc;
	}
	
	
	
}

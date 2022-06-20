package com.infy.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="prd_tbl")
public class Product {

	@Id
	@Column(name="pid")
	int productId;
	@Column(name="pname")
	String productName;
	@Column(name="prate")
	int productRate;
	@Column(name="pqty")
	int ProductQty;
	public Product() {
		super();
	}
	public Product(int productId, String productName, int productRate, int productQty) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productRate = productRate;
		ProductQty = productQty;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductRate() {
		return productRate;
	}
	public void setProductRate(int productRate) {
		this.productRate = productRate;
	}
	public int getProductQty() {
		return ProductQty;
	}
	public void setProductQty(int productQty) {
		ProductQty = productQty;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productRate=" + productRate
				+ ", ProductQty=" + ProductQty + "]";
	}
	
	
}

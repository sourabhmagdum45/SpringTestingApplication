package com.example.Spring_boot_95_AllConcept.OrderData;

public class Order {
	 private Long id;
	 private String orderName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public Order(Long id, String orderName) {
		super();
		this.id = id;
		this.orderName = orderName;
	}
	 
	 
}

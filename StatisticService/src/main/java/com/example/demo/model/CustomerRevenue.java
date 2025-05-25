package com.example.demo.model;

//import lombok.AllArgsConstructor;
import lombok.Data;

@Data
//@AllArgsConstructor
public class CustomerRevenue {
	private Long customerId;
	private String customerName;
	private double totalRevenue;
	public CustomerRevenue(Long customerId, String customerName, double totalRevenue) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.totalRevenue = totalRevenue;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getTotalRevenue() {
		return totalRevenue;
	}
	public void setTotalRevenue(double totalRevenue) {
		this.totalRevenue = totalRevenue;
	}
}

package com.example.demo.model;

import lombok.Data;

@Data
public class Contract {
    private Long id;
    private Long customerId;
    private double tienTraTruoc;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public double getTienTraTruoc() {
		return tienTraTruoc;
	}
	public void setTienTraTruoc(double tienTraTruoc) {
		this.tienTraTruoc = tienTraTruoc;
	}
}

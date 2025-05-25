package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contract {

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

	public double getTongGiaTri() {
		return tongGiaTri;
	}

	public void setTongGiaTri(double tongGiaTri) {
		this.tongGiaTri = tongGiaTri;
	}

	public double getTienTraTruoc() {
		return tienTraTruoc;
	}

	public void setTienTraTruoc(double tienTraTruoc) {
		this.tienTraTruoc = tienTraTruoc;
	}

	public int getSoThangTraGop() {
		return soThangTraGop;
	}

	public void setSoThangTraGop(int soThangTraGop) {
		this.soThangTraGop = soThangTraGop;
	}

	public String getNgayKy() {
		return ngayKy;
	}

	public void setNgayKy(String ngayKy) {
		this.ngayKy = ngayKy;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;

    private double tongGiaTri;
    private double tienTraTruoc;
    private int soThangTraGop;

    private String ngayKy;
}

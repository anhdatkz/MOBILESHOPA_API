package com.example.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="TRANGTHAI")
public class TrangThai {
	@Id
	@Column(name="MATRANGTHAI")
	private Integer matrangthai;
	private String trangthai;
	
	@OneToMany(mappedBy="trangThai")
	@JsonIgnore
	private List<GioHang> gioHangs;

	public TrangThai() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TrangThai(Integer matrangthai, String trangthai, List<GioHang> gioHangs) {
		super();
		this.matrangthai = matrangthai;
		this.trangthai = trangthai;
		this.gioHangs = gioHangs;
	}

	public Integer getMatrangthai() {
		return matrangthai;
	}

	public void setMatrangthai(Integer matrangthai) {
		this.matrangthai = matrangthai;
	}

	public String getTrangthai() {
		return trangthai;
	}

	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}

	public List<GioHang> getGioHangs() {
		return gioHangs;
	}

	public void setGioHangs(List<GioHang> gioHangs) {
		this.gioHangs = gioHangs;
	}
	
	
}

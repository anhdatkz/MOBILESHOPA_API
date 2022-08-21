package com.example.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "HANG")
public class Hang {
	@Id
	@Column(name = "mahang")
	private String mahang;
	
	@Column(name = "tenhang")
	private String tenhang;
	
	@OneToMany(mappedBy="hang")
	@JsonIgnore
	private List<LoaiSanPham> loaiSanPhams;
	
	
	public Hang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hang(String mahang, String tenhang, List<LoaiSanPham> loaiSanPhams) {
		super();
		this.mahang = mahang;
		this.tenhang = tenhang;
		this.loaiSanPhams = loaiSanPhams;
	}

	public String getmahang() {
		return mahang;
	}
	public void setmahang(String mahang) {
		this.mahang = mahang;
	}
	public String gettenhang() {
		return tenhang;
	}
	public void settenhang(String tenhang) {
		this.tenhang = tenhang;
	}

	public	List<LoaiSanPham> getLoaiSanPhams() {
		return loaiSanPhams;
	}

	public void setLoaiSanPhams(List<LoaiSanPham> loaiSanPhams) {
		this.loaiSanPhams = loaiSanPhams;
	}
	
	
}

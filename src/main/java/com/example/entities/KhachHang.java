package com.example.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="KHACHHANG")
public class KhachHang {
	@Id
	@Column(name="CMND")
	private String cmnd;
	private String tenkh;
	private String diachi;
	private Date ngaysinh;
	private String sdt;
	private String email;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="matk")
	private TaiKhoan taiKhoanKH;
	
	@OneToMany(mappedBy="khachHang")
	@JsonIgnore
	private List<GioHang> gioHangs;
	
	@OneToMany(mappedBy="khachHangBL")
	@JsonIgnore
	private List<BinhLuan> binhLuansKH;

	public KhachHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getTenkh() {
		return tenkh;
	}

	public void setTenkh(String tenkh) {
		this.tenkh = tenkh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public Date getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TaiKhoan getTaiKhoanKH() {
		return taiKhoanKH;
	}

	public void setTaiKhoanKH(TaiKhoan taiKhoanKH) {
		this.taiKhoanKH = taiKhoanKH;
	}

	public List<GioHang> getGioHangs() {
		return gioHangs;
	}

	public void setGioHangs(List<GioHang> gioHangs) {
		this.gioHangs = gioHangs;
	}

	public List<BinhLuan> getBinhLuansKH() {
		return binhLuansKH;
	}

	public void setBinhLuansKH(List<BinhLuan> binhLuansKH) {
		this.binhLuansKH = binhLuansKH;
	}
	
	
	
	
	
}

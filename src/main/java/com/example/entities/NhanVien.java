package com.example.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="NHANVIEN")
public class NhanVien {
	@Id
	@Column(name="MANV")
	private String manv;
	private String hoten;
	private Date ngaysinh;
	private String sdt;
	private String diachi;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="matk")
	@JsonIgnore
	private TaiKhoan taiKhoanNV;
	
	@OneToMany(mappedBy="nhanVienDH")
	@JsonIgnore
	private List<DatHang> datHangsNV;
	
	@OneToMany(mappedBy="nhanVienTDG")
	@JsonIgnore
	private List<ThayDoiGia> thayDoiGiasNV;
	
	@OneToMany(mappedBy="nhanVienGiao")
	@JsonIgnore
	private List<GioHang> gioHangsNVG;
	
	
	@OneToMany(mappedBy="nhanVienDuyet")
	@JsonIgnore
	private List<GioHang> gioHangsNVD;
	
	@OneToMany(mappedBy="nhanVienPT")
	@JsonIgnore
	private List<PhieuTra> phieuTrasNV;
	
	@OneToMany(mappedBy="nhanVienNhanBH")
	@JsonIgnore
	private List<CTNhanBH> ctNhanBHsNV;

	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getManv() {
		return manv;
	}

	public void setManv(String manv) {
		this.manv = manv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
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

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public TaiKhoan getTaiKhoanNV() {
		return taiKhoanNV;
	}

	public void setTaiKhoanNV(TaiKhoan taiKhoanNV) {
		this.taiKhoanNV = taiKhoanNV;
	}

	public List<DatHang> getDatHangsNV() {
		return datHangsNV;
	}

	public void setDatHangsNV(List<DatHang> datHangsNV) {
		this.datHangsNV = datHangsNV;
	}

	public List<ThayDoiGia> getThayDoiGiasNV() {
		return thayDoiGiasNV;
	}

	public void setThayDoiGiasNV(List<ThayDoiGia> thayDoiGiasNV) {
		this.thayDoiGiasNV = thayDoiGiasNV;
	}

	public List<GioHang> getGioHangsNVG() {
		return gioHangsNVG;
	}

	public void setGioHangsNVG(List<GioHang> gioHangsNVG) {
		this.gioHangsNVG = gioHangsNVG;
	}

	public List<GioHang> getGioHangsNVD() {
		return gioHangsNVD;
	}

	public void setGioHangsNVD(List<GioHang> gioHangsNVD) {
		this.gioHangsNVD = gioHangsNVD;
	}

	public List<PhieuTra> getPhieuTrasNV() {
		return phieuTrasNV;
	}

	public void setPhieuTrasNV(List<PhieuTra> phieuTrasNV) {
		this.phieuTrasNV = phieuTrasNV;
	}

	public List<CTNhanBH> getCtNhanBHsNV() {
		return ctNhanBHsNV;
	}

	public void setCtNhanBHsNV(List<CTNhanBH> ctNhanBHsNV) {
		this.ctNhanBHsNV = ctNhanBHsNV;
	}
	
	
 	
}

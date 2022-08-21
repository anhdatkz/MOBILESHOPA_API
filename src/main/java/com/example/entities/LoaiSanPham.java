package com.example.entities;

import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name ="LOAISANPHAM")
public class LoaiSanPham {
	@Id
	@Column(name="MALOAI")
	private String maloai;
	private String tenloai;
	private String anh;
	private String mota;
	private String chip;
	private Integer ram;
	private Integer rom;
	private String hedieuhanh;
	private Integer pin;
	private String manhinh;
	private Integer soluongton;
	private Integer thoigianbh;
	
	@ManyToOne
	@JoinColumn(name="mahang")
	private Hang hang;
	
	@OneToMany(mappedBy="loaiSanPhamCTDH")
	@JsonIgnore
	private List<CTDDH> ctddhLSP;
	
	@OneToMany(mappedBy="loaiSanPhamCTGG")
//	@JsonIgnore
	private List<CTGiamGia> ctGiamGiaLSP;
	
	@OneToMany(mappedBy = "loaiSanPham")
	@JsonIgnore
	private List<SanPham> sanPhams;
	
	@OneToMany(mappedBy="loaiSanPhamBL")
	@JsonIgnore
	private List<BinhLuan> binhLuansLSP;
	
	@OneToMany(mappedBy="loaiSanPhamCC")
	@JsonIgnore
	private List<CungCap> cungCapsLSP;
	
	@OneToMany(mappedBy="loaiSanPhamTDG")
	private List<ThayDoiGia> thayDoiGiasLSP;
	
	
	public LoaiSanPham() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getMaloai() {
		return maloai;
	}

	public void setMaloai(String maloai) {
		this.maloai = maloai;
	}

	public String getTenloai() {
		return tenloai;
	}

	public void setTenloai(String tenloai) {
		this.tenloai = tenloai;
	}

	public String getAnh() {
		return anh;
	}

	public void setAnh(String anh) {
		this.anh = anh;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public String getChip() {
		return chip;
	}

	public void setChip(String chip) {
		this.chip = chip;
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	public Integer getRom() {
		return rom;
	}

	public void setRom(Integer rom) {
		this.rom = rom;
	}

	public String getHedieuhanh() {
		return hedieuhanh;
	}

	public void setHedieuhanh(String hedieuhanh) {
		this.hedieuhanh = hedieuhanh;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}
	
	
	public String getManhinh() {
		return manhinh;
	}


	public void setManhinh(String manhinh) {
		this.manhinh = manhinh;
	}


	public Integer getSoluongton() {
		return soluongton;
	}

	public void setSoluongton(Integer soluongton) {
		this.soluongton = soluongton;
	}

	public Integer getThoigianbh() {
		return thoigianbh;
	}

	public void setThoigianbh(Integer thoigianbh) {
		this.thoigianbh = thoigianbh;
	}

	public Hang getHang() {
		return hang;
	}

	public void setHang(Hang hang) {
		this.hang = hang;
	}


	public List<CTDDH> getCtddhLSP() {
		return ctddhLSP;
	}


	public void setCtddhLSP(List<CTDDH> ctddhLSP) {
		this.ctddhLSP = ctddhLSP;
	}


	public List<CTGiamGia> getCtGiamGiaLSP() {
		return ctGiamGiaLSP;
	}


	public void setCtGiamGiaLSP(List<CTGiamGia> ctGiamGiaLSP) {
		this.ctGiamGiaLSP = ctGiamGiaLSP;
	}


	public List<SanPham> getSanPhams() {
		return sanPhams;
	}


	public void setSanPhams(List<SanPham> sanPhams) {
		this.sanPhams = sanPhams;
	}


	public List<BinhLuan> getBinhLuansLSP() {
		return binhLuansLSP;
	}


	public void setBinhLuansLSP(List<BinhLuan> binhLuansLSP) {
		this.binhLuansLSP = binhLuansLSP;
	}


	public List<CungCap> getCungCapsLSP() {
		return cungCapsLSP;
	}


	public void setCungCapsLSP(List<CungCap> cungCapsLSP) {
		this.cungCapsLSP = cungCapsLSP;
	}


	public List<ThayDoiGia> getThayDoiGiasLSP() {
		return thayDoiGiasLSP;
	}


	public void setThayDoiGiasLSP(List<ThayDoiGia> thayDoiGiasLSP) {
		this.thayDoiGiasLSP = thayDoiGiasLSP;
	}
	
	
}

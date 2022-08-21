package com.example.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="GIOHANG")
public class GioHang {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="IDGIOHANG")
	private Integer idgiohang;
	private Date ngay;
	private String tennguoinhan;
	private String diachinhan;
	private String sdtnguoinhan;
	private float tongtien;
	
	@OneToMany(mappedBy="gioHang")
	@JsonIgnore
	private List<SanPham> sanPhams;
	
	@OneToOne(mappedBy="gioHang")
	private HoaDon hoaDon;
	
	@ManyToOne
	@JoinColumn(name="matrangthai")
	private TrangThai trangThai;
	
	@ManyToOne
	@JoinColumn(name="cmnd")
	private KhachHang khachHang;
	
	@ManyToOne
	@JoinColumn(name="manvduyet")
	private NhanVien nhanVienDuyet;
	
	@ManyToOne
	@JoinColumn(name = "manvgiao")
	private NhanVien nhanVienGiao;

	public GioHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public GioHang(Integer idgiohang, Date ngay, String tennguoinhan, String diachinhan, String sdtnguoinhan,
			float tongtien, List<SanPham> sanPhams, HoaDon hoaDon, TrangThai trangThai, KhachHang khachHang,
			NhanVien nhanVienDuyet, NhanVien nhanVienGiao) {
		super();
		this.idgiohang = idgiohang;
		this.ngay = ngay;
		this.tennguoinhan = tennguoinhan;
		this.diachinhan = diachinhan;
		this.sdtnguoinhan = sdtnguoinhan;
		this.tongtien = tongtien;
		this.sanPhams = sanPhams;
		this.hoaDon = hoaDon;
		this.trangThai = trangThai;
		this.khachHang = khachHang;
		this.nhanVienDuyet = nhanVienDuyet;
		this.nhanVienGiao = nhanVienGiao;
	}

	

	public Integer getIdgiohang() {
		return idgiohang;
	}

	public void setIdgiohang(Integer idgiohang) {
		this.idgiohang = idgiohang;
	}

	public Date getNgay() {
		return ngay;
	}

	public void setNgay(Date ngay) {
		this.ngay = ngay;
	}

	public String getTennguoinhan() {
		return tennguoinhan;
	}

	public void setTennguoinhan(String tennguoinhan) {
		this.tennguoinhan = tennguoinhan;
	}

	public String getDiachinhan() {
		return diachinhan;
	}

	public void setDiachinhan(String diachinhan) {
		this.diachinhan = diachinhan;
	}

	public String getSdtnguoinhan() {
		return sdtnguoinhan;
	}

	public void setSdtnguoinhan(String sdtnguoinhan) {
		this.sdtnguoinhan = sdtnguoinhan;
	}

	public float getTongtien() {
		return tongtien;
	}

	public void setTongtien(float tongtien) {
		this.tongtien = tongtien;
	}

	public List<SanPham> getSanPhams() {
		return sanPhams;
	}

	public void setSanPhams(List<SanPham> sanPhams) {
		this.sanPhams = sanPhams;
	}
	
	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	public TrangThai getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(TrangThai trangThai) {
		this.trangThai = trangThai;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public NhanVien getNhanVienDuyet() {
		return nhanVienDuyet;
	}

	public void setNhanVienDuyet(NhanVien nhanVienDuyet) {
		this.nhanVienDuyet = nhanVienDuyet;
	}

	public NhanVien getNhanVienGiao() {
		return nhanVienGiao;
	}

	public void setNhanVienGiao(NhanVien nhanVienGiao) {
		this.nhanVienGiao = nhanVienGiao;
	}
	
	
	
}

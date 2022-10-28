package com.example.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "CTGIOHANG")
public class CTGH {
	@EmbeddedId
	private CTGHKeys id;
	private Integer soluong;
	private float tonggia;

	
	@ManyToOne
	@MapsId("maddhctgh")
	@JoinColumn(name="idgiohang")
	private GioHang gioHangCTGH;
	
	@ManyToOne
	@MapsId("maloaictgh")
	@JoinColumn(name="maloai")
	private LoaiSanPham loaiSanPhamCTGH;
}

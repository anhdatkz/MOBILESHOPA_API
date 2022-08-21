package com.example.controllers;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.GioHang;
import com.example.service.GioHangService;

@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class GioHangController {
	@Autowired
	private GioHangService gioHangService;
	
	@GetMapping("/giohang")
	public List<GioHang> getAllGioHang(){
		return this.gioHangService.listAll();
	}
	
	@PostMapping("/giohang")
	public void saveGioHang(@RequestBody GioHang gioHang){
		this.gioHangService.save(gioHang);;
	}
	
	@GetMapping("/giohang/{id}")
	public ResponseEntity<GioHang> getGioHangById(@PathVariable Integer id){
		try {
			GioHang gioHang = gioHangService.getGioHangById(id);
			return new ResponseEntity<GioHang>(gioHang, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return new ResponseEntity<GioHang>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/giohang/{id}")
	public ResponseEntity<GioHang> updateLoaiSanPham(@RequestBody GioHang gioHang,
			@PathVariable Integer id){
		try {
			GioHang gioHangSP = gioHangService.getGioHangById(id);
			gioHangService.save(gioHang);
			return new ResponseEntity<GioHang>(gioHang, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return new ResponseEntity<GioHang>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/giohang/{id}")
	public void deleteLoaiSanPhamById(@PathVariable Integer id){
		gioHangService.deleteGioHangById(id);
	}
}

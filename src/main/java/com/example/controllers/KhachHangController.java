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

import com.example.entities.KhachHang;
import com.example.service.KhachHangService;

@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class KhachHangController {
	@Autowired
	private KhachHangService khachHangService;
	
	@GetMapping("/khachhang")
	public List<KhachHang> getAllHang(){
		return this.khachHangService.listAll();
	}
	
	@PostMapping("/khachhang")
	public void saveHang(@RequestBody KhachHang khachHang){
		this.khachHangService.save(khachHang);
	}
	
	@GetMapping("/khachhang/{id}")
	public ResponseEntity<KhachHang> getHangById(@PathVariable String id){
		try {
			KhachHang kh = khachHangService.getKhachHangById(id);
			return new ResponseEntity<KhachHang>(kh, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return new ResponseEntity<KhachHang>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/khachhang/{id}")
	public ResponseEntity<KhachHang> updateHang(@RequestBody KhachHang khachHang,
			@PathVariable String id){
		try {
			KhachHang khachHangExist = khachHangService.getKhachHangById(id);
			khachHangService.save(khachHang);
			return new ResponseEntity<KhachHang>(khachHang, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return new ResponseEntity<KhachHang>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/khachhang/{id}")
	public void deleteHangById(@PathVariable String id){
		khachHangService.deleteKhachHangById(id);
	}
}

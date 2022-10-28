package com.example.controllers;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Hang;
import com.example.entities.LoaiSanPham;
import com.example.service.LoaiSanPhamService;

@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class LoaiSanPhamController {
	@Autowired
	private LoaiSanPhamService loaiSanPhamService;
	
	@GetMapping("/loaisanpham")
	public List<LoaiSanPham> getAllLoaiSanPham(){
		return this.loaiSanPhamService.listAll();
	}
	
	@GetMapping("/loaisanpham/search/query={id}")
	public List<LoaiSanPham> findLoaiSanPhamByHang(@PathVariable String id){
		return this.loaiSanPhamService.findLoaiSanPhamByHang(id);
	}
	
	@PostMapping("/loaisanpham")
	public void saveLoaiSanPham(@RequestBody LoaiSanPham loaiSanPham){
		this.loaiSanPhamService.save(loaiSanPham);
	}
	
	@GetMapping("/loaisanpham/{id}")
	public ResponseEntity<LoaiSanPham> getLoaiSanPhamById(@PathVariable String id){
		try {
			LoaiSanPham loaiSanPham = loaiSanPhamService.getLoaiSanPhamById(id);
			return new ResponseEntity<LoaiSanPham>(loaiSanPham, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return new ResponseEntity<LoaiSanPham>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/loaisanpham/{id}")
	public ResponseEntity<LoaiSanPham> updateLoaiSanPham(@RequestBody LoaiSanPham loaiSanPham,
			@PathVariable String id){
		try {
			LoaiSanPham loaiSP = loaiSanPhamService.getLoaiSanPhamById(id);
			loaiSanPhamService.save(loaiSanPham);
			return new ResponseEntity<LoaiSanPham>(loaiSanPham, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return new ResponseEntity<LoaiSanPham>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/loaisanpham/{id}")
	public void deleteLoaiSanPhamById(@PathVariable String id){
		loaiSanPhamService.deleteLoaiSanPhamById(id);
	}
}

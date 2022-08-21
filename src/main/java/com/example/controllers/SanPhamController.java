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

import com.example.entities.SanPham;
import com.example.service.SanPhamService;


@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class SanPhamController {
	@Autowired
	private SanPhamService sanPhamService;
	
	@GetMapping("/sanpham")
	public List<SanPham> getAllSanPham(){
		return this.sanPhamService.listAll();
	}
	
	@PostMapping("/sanpham")
	public void saveSanPham(@RequestBody SanPham sanPham){
		this.sanPhamService.save(sanPham);;
	}
	
	@GetMapping("/sanpham/{id}")
	public ResponseEntity<SanPham> getSanPhamById(@PathVariable String id){
		try {
			SanPham sanPham = sanPhamService.getSanPhamById(id);
			return new ResponseEntity<SanPham>(sanPham, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return new ResponseEntity<SanPham>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/sanpham/{id}")
	public ResponseEntity<SanPham> updateSanPham(@RequestBody SanPham sanPham,
			@PathVariable String id){
		try {
			SanPham sanPham2 = sanPhamService.getSanPhamById(id);
			sanPhamService.save(sanPham);
			return new ResponseEntity<SanPham>(sanPham, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return new ResponseEntity<SanPham>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/sanpham/{id}")
	public void deleteSanPhamById(@PathVariable String id){
		sanPhamService.deleteSanPhamById(id);
	}
}

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

import com.example.entities.Hang;
import com.example.service.HangService;

@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class HangController {
	@Autowired
	private HangService hangService;
	
	@GetMapping("/hang")
	public List<Hang> getAllHang(){
		return this.hangService.listAll();
	}
	
	@PostMapping("/hang")
	public void saveHang(@RequestBody Hang hang){
		this.hangService.save(hang);
	}
	
	@GetMapping("/hang/{id}")
	public ResponseEntity<Hang> getHangById(@PathVariable String id){
		try {
			Hang hang = hangService.getHangById(id);
			return new ResponseEntity<Hang>(hang, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return new ResponseEntity<Hang>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/hang/{id}")
	public ResponseEntity<Hang> updateHang(@RequestBody Hang hang,
			@PathVariable String id){
		try {
			Hang hangExist = hangService.getHangById(id);
			hangService.save(hang);
			return new ResponseEntity<Hang>(hang, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return new ResponseEntity<Hang>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/hang/{id}")
	public void deleteHangById(@PathVariable String id){
		hangService.deleteHangById(id);
	}
}

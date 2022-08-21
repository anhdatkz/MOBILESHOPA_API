package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.GioHang;
import com.example.repository.GioHangRepository;


@Service
public class GioHangService {
	@Autowired
	private GioHangRepository gioHangRepository;
	
	public List<GioHang> listAll(){
		return (List<GioHang>)gioHangRepository.findAll();
	}
	
	public void save(GioHang gioHang){
		gioHangRepository.save(gioHang);
	}
	
	public GioHang getGioHangById(Integer idgio){
		return gioHangRepository.findById(idgio).get();
	}
	
	public void deleteGioHangById(Integer idgio){
		gioHangRepository.deleteById(idgio);
	}
}

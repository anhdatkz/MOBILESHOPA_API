package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.KhachHang;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang, String>{

}

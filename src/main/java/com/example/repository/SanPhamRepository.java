package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.SanPham;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, String>{

}

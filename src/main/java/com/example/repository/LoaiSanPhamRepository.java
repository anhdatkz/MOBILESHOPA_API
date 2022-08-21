package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.LoaiSanPham;

@Repository
public interface LoaiSanPhamRepository extends JpaRepository<LoaiSanPham, String>{
	@Query("select lsp from LoaiSanPham lsp where lsp.hang.mahang= :id")
	public List<LoaiSanPham> findLoaiSanPhamByHang(@Param("id") String mahang);
	
	@Query("select lsp from LoaiSanPham lsp where lsp.maloai= :id")
	public LoaiSanPham findLoaiSanPhamByID(@Param("id") String maloai);
	
	
}

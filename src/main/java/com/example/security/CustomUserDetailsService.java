//package com.example.security;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.stream.Collectors;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.example.entities.Quyen;
//import com.example.entities.TaiKhoan;
//import com.example.repository.TaiKhoanRepository;
//
//@Service
//public class CustomUserDetailsService implements UserDetailsService{
//	private TaiKhoanRepository taiKhoanRepository;
//	
//	public CustomUserDetailsService(TaiKhoanRepository taiKhoanRepository) {
//		// TODO Auto-generated constructor stub
//		this.taiKhoanRepository = taiKhoanRepository;
//	}
//	
//	@Override
//	public UserDetails loadUserByUsername(String matk) throws UsernameNotFoundException {
//		TaiKhoan user = taiKhoanRepository.findById(matk)
//	               .orElseThrow(() ->
//	                       new UsernameNotFoundException("User not found with username:" + matk));
//	        return new org.springframework.security.core.userdetails.User(user.getMatk(),
//	                user.getPassword(), mapRolesToAuthorities(user));
//	    }
//
//	    private Collection<GrantedAuthority> mapRolesToAuthorities(TaiKhoan user){
//	    	Collection<GrantedAuthority> authorities = new ArrayList<>();
//			if (user.getQuyen().getTenquyen().equalsIgnoreCase("admin")) {
//				authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
//			}
//			authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
//			return authorities;
//	    }
//
//}

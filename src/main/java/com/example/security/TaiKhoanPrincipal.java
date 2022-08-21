//package com.example.security;
//
//import java.util.Collection;
//import java.util.List;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import com.example.entities.TaiKhoan;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//public class TaiKhoanPrincipal implements UserDetails{
//
//	private String username;
//
//    @JsonIgnore
//    private String password;
//    
//    private GrantedAuthority authorities;
//    
//	public TaiKhoanPrincipal(String username, String password, GrantedAuthority authorities) {
//		super();
//		this.username = username;
//		this.password = password;
//		this.authorities = authorities;
//	}
//
////	public static TaiKhoanPrincipal build(TaiKhoan user) {
////	    GrantedAuthority authorities = user.getQuyen().getTenquyen().toString();
////	    return new TaiKhoanPrincipal( 
////	        user.getMatk(), 
////	        user.getPassword(), 
////	        authorities);
////	  }
//
//	@Override
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getPassword() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String getUsername() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean isAccountNonExpired() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean isAccountNonLocked() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean isCredentialsNonExpired() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean isEnabled() {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	
//	
//}

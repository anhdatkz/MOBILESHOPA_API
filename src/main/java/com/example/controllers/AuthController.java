//package com.example.controllers;
//
//import java.net.URI;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Set;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//import com.example.entities.Quyen;
//import com.example.entities.RoleName;
//import com.example.entities.TaiKhoan;
//import com.example.exception.AppException;
//import com.example.repository.QuyenRepository;
//import com.example.repository.TaiKhoanRepository;
//import com.example.payload.ApiResponse;
//import com.example.payload.LoginRequest;
//import com.example.payload.SignUpRequest;
//
////import com.example.repository.QuyenRepository;
////import com.example.repository.TaiKhoanRepository;
////import com.example.security.JwtTokenProvider;
////import com.example.entities.RoleName;
////import com.example.entities.TaiKhoan;
////import com.example.exception.AppException;
////import com.example.payload.ApiResponse;
////import com.example.payload.SignUpRequest;
////import com.example.entities.Quyen;
////import com.example.payload.JwtAuthenticationResponse;
////import com.example.payload.LoginRequest;
////import com.example.security.UserPrincipal;
//
//@RestController
//@RequestMapping("/api/v1/")
//public class AuthController {
//	@Autowired
//	private AuthenticationManager authenticationManager;
//	
//	@Autowired
//	private TaiKhoanRepository taiKhoanRepository;
//	
//	@Autowired
//	private QuyenRepository quyenRepository;
//	
//	@Autowired 
//	private PasswordEncoder passwordEncoder;
//	
//	@PostMapping("/signin")
//    public ResponseEntity<String> authenticateUser(@RequestBody LoginRequest loginRequest){
//        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
//                loginRequest.getMatk(), loginRequest.getPassword()));
//
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        return new ResponseEntity<>("User signed-in successfully!.", HttpStatus.OK);
//    }
//
//    
//	@PostMapping("/signup")
//    public ResponseEntity<?> registerUser(@RequestBody SignUpRequest signUpRequest){
//
//    	if(taiKhoanRepository.existsByUsername(signUpRequest.getMatk())) {
//            return new ResponseEntity(new ApiResponse(false, "Username is already taken!"),
//                    HttpStatus.BAD_REQUEST);
//        }
//
//        // Creating user's account
//    	TaiKhoan user = new TaiKhoan();
//        user.setMatk(signUpRequest.getMatk());
//        user.setPassword(passwordEncoder.encode(signUpRequest.getPassword()));
//
//        Quyen roles = quyenRepository.findById("KH").get();
//        user.setQuyen(roles);
//
//        taiKhoanRepository.save(user);
//
//        return new ResponseEntity<>("User registered successfully", HttpStatus.OK);
//
//    }
//}

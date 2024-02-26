package com.wecp.medicalequipmentandtrackingsystem.controller;


import com.wecp.medicalequipmentandtrackingsystem.dto.LoginRequest;
import com.wecp.medicalequipmentandtrackingsystem.dto.LoginResponse;
import com.wecp.medicalequipmentandtrackingsystem.entitiy.User;
import com.wecp.medicalequipmentandtrackingsystem.jwt.JwtUtil;
import com.wecp.medicalequipmentandtrackingsystem.repository.UserRepository;
import com.wecp.medicalequipmentandtrackingsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
// import org.springframework.security.core.Authentication;
// import org.springframework.security.core.AuthenticationException;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/user")
public class RegisterAndLoginController {

    @Autowired
    private UserService userService;

    // @Autowired
    // AuthenticationManager authenticationManager;

    @Autowired
    JwtUtil jwtUtil;


    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {

        return new ResponseEntity<>(userService.registerUser(user), HttpStatus.CREATED);

        // register user and return the registered user with status code 201 created
    }

    // @PostMapping("/login")
    // public ResponseEntity<String> loginUser(@RequestBody LoginRequest loginRequest) {
        
    //     Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
    //     if (authentication.isAuthenticated()) {
    //         return ResponseEntity.ok(jwtUtil.generateToken(loginRequest.getUsername()));
    //     } else {
    //         return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    //     }
        


    
    //     // login user and return the login response with status code 200 ok
    //     // if authentication fails, return status code 401 unauthorized
    // }
}

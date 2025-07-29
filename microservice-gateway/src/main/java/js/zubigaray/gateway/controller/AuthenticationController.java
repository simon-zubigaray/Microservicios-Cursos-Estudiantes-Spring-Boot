package js.zubigaray.gateway.controller;

import jakarta.validation.Valid;
import js.zubigaray.gateway.controller.dto.AuthCreateUserRequest;
import js.zubigaray.gateway.controller.dto.AuthLoginRequest;
import js.zubigaray.gateway.controller.dto.AuthResponse;
import js.zubigaray.gateway.service.UserDetailsServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    private final UserDetailsServiceImpl userDetailsService;

    public AuthenticationController(UserDetailsServiceImpl userDetailsService){
        this.userDetailsService = userDetailsService;
    }

    @PostMapping("/sign-up")
    public ResponseEntity<AuthResponse> register(@RequestBody @Valid AuthCreateUserRequest authCreateUser){
        return new ResponseEntity<>(this.userDetailsService.createUser(authCreateUser), HttpStatus.OK);
    }

    @PostMapping("/log-in")
    public ResponseEntity<AuthResponse> login(@RequestBody @Valid AuthLoginRequest userRequest){
        return new ResponseEntity<>(this.userDetailsService.loginUser(userRequest), HttpStatus.OK);
    }


}

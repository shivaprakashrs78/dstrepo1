package com.user.info.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.info.service.UserInfoService;

@CrossOrigin(origins = "http://localhost:3001")
@RestController
@RequestMapping("/info/users")
public class UserInfoController {
	
	private final UserInfoService userInfoService;
	
	public UserInfoController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }
  
	@GetMapping
    public String getAllUsers() {
        return userInfoService.getAllUsersFromUserDetails();
    }


}

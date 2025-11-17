package com.user.info.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class UserInfoService {
	
	 private final RestTemplate restTemplate = new RestTemplate();

	    @Value("${userdetails.service.url}")
	    private String userDetailsServiceUrl;

	    public String getAllUsersFromUserDetails() {
	        ResponseEntity<String> response = restTemplate.getForEntity(userDetailsServiceUrl, String.class);
	        return response.getBody();
	    }

}

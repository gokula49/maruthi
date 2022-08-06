package com.example.gokula.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.gokula.payload.Profile;
import com.example.gokula.payload.ProfileService;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ProfilePostingControlle {
	
	@Autowired
	private ProfileService profileService;
	
	
	@PostMapping("/profilePosting")
	public Profile postprofile(@RequestBody Profile profile) {
		return profileService.postProfile(profile);
		
	}
	
   @GetMapping("/getProfile")
   public ArrayList<Profile> getAllProfiles(){
	   return profileService.getProfiles();
   }

	

}

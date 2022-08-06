package com.example.gokula.payload;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gokula.Repo.ProfileRepository;

@Service
public class ProfileService {

	@Autowired
	private ProfileRepository profileRepository;
	
	public Profile postProfile(Profile profile) {
		return profileRepository.save(profile);
	}
	
	public ArrayList<Profile> getProfiles(){
		return (ArrayList<Profile>) profileRepository.findAll();
	}
	
	
}

package com.example.gokula;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.gokula.Repo.UserRepository;
import com.example.gokula.controller.RolesController;
import com.example.gokula.models.ERole;
import com.example.gokula.models.Role;

@SpringBootApplication
public class ZohoRecruitApplication implements CommandLineRunner {
	@Autowired
	RolesController rolesController;

	public static void main(String[] args) {
		SpringApplication.run(ZohoRecruitApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		rolesController.save(new Role(ERole.ROLE_USER));
		rolesController.save(new Role(ERole.ROLE_ADMIN));
		rolesController.save(new Role(ERole.ROLE_MODERATOR));
		System.out.println("Sending Email...");

	}


}



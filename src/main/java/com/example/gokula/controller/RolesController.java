package com.example.gokula.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gokula.Repo.RoleRepository;
import com.example.gokula.models.Role;

@Service

public class RolesController {
    @Autowired
    RoleRepository roleRepository;
    public Role save(Role role){
        return roleRepository.save(role);

    }
   
}

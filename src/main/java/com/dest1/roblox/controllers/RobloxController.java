package com.dest1.roblox.controllers;

import com.dest1.roblox.entities.Roblox;
import com.dest1.roblox.repositories.RobloxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Roblox")
public class RobloxController {

    @Autowired
    RobloxRepository repository;

    @PostMapping
    public Roblox Mss_stacyy (@RequestBody Roblox Mss_stacyy){
        return repository.save(Mss_stacyy);
    }

    @GetMapping("Roblox")
    public List<Roblox> mostrar(){
        return repository.findAll();
    }
}
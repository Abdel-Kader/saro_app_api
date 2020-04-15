package com.sapp.api.main.rest;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sapp.api.main.entities.Profil;
import com.sapp.api.main.repositories.ProfilRepository;

@RestController
public class ProfilRest 
{
	@Resource
	private ProfilRepository profilRepository;
	
	@GetMapping("/profil/{id}")
	public Optional<Profil> findOneProfil(@PathVariable Long id)
	{
		return profilRepository.findById(id);
	}
	
	@GetMapping("/allProfils")
	public List<Profil> getAllProfils()
	{
		return profilRepository.findAll();
	}
	
	@PostMapping("/addProfil")
	public Profil addProfil(@RequestBody Profil profil)
	{
		return profilRepository.save(profil);
	}
	
	@PostMapping("/editProfil")
	public Profil editProfil(@RequestBody Profil profil)
	{
		return profilRepository.save(profil);
	}
	
	@DeleteMapping("/deleteProfil/{id}")
	public void deleteProfil(@PathVariable Long id)
	{
		profilRepository.deleteById(id);
	}
	
	
}

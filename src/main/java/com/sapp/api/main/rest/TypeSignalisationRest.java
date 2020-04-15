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

import com.sapp.api.main.entities.TypeSignalisation;
import com.sapp.api.main.repositories.TypeSignalisationRepository;

@RestController
public class TypeSignalisationRest 
{
	@Resource
	private TypeSignalisationRepository typeSignalisationRepository;
	
	@GetMapping("/typeSignalisation/{id}")
	public Optional<TypeSignalisation> findOneType(@PathVariable Long id)
	{
		return typeSignalisationRepository.findById(id);
	}
	
	@GetMapping("allTypeSignalisation")
	public List<TypeSignalisation> getAllType()
	{
		return typeSignalisationRepository.findAll();
	}
	
	@PostMapping("addTypeSignalisation")
	public TypeSignalisation addType(@RequestBody TypeSignalisation typeSignalisation)
	{
		return typeSignalisationRepository.save(typeSignalisation);
	}
	
	@PostMapping("updateTypeSignalisation")
	public TypeSignalisation updateType(@RequestBody TypeSignalisation typeSignalisation)
	{
		return typeSignalisationRepository.save(typeSignalisation);
	}
	
	@DeleteMapping("deleteTypeSignalisation/{id}")
	public void deteleTypeSignalisation(@PathVariable Long id)
	{
		typeSignalisationRepository.deleteById(id);
	}
}

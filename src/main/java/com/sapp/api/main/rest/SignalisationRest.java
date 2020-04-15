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

import com.sapp.api.main.entities.Signalisation;
import com.sapp.api.main.repositories.SignalisationRepository;

@RestController
public class SignalisationRest 
{
	@Resource
	private SignalisationRepository signalisationRepository;
	
	@GetMapping("signalisation/{id}")
	public Optional<Signalisation> findOne(@PathVariable Long id)
	{
		return signalisationRepository.findById(id);
	}
	
	@GetMapping("signalisations")
	public List<Signalisation> getAllSignalisation()
	{
		return signalisationRepository.findAll();
	}
	
	@PostMapping("addSignalisation")
	public Signalisation addSignalisation(@RequestBody Signalisation signalisation)
	{
		return signalisationRepository.save(signalisation);
	}
	
	@PostMapping("editSignalisation")
	public Signalisation editSignalisation(@RequestBody Signalisation signalisation)
	{
		return signalisationRepository.save(signalisation);
	}
	
	@DeleteMapping("deleteSignalisation/{id}")
	public void deleteSignalisation(@PathVariable Long id)
	{
		signalisationRepository.deleteById(id);
	}
	
}

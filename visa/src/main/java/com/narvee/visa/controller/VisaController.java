package com.narvee.visa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.narvee.visa.entity.Visa;
import com.narvee.visa.service.VisaService;

@RestController("/usit/res/")
public class VisaController {

	@Autowired
	private VisaService service;

	@PostMapping("visa")
	public Visa saveVisa(@RequestBody Visa visa) {
		return service.saveVisa(visa);
	}

	@GetMapping("visa/{visaId}")
	public Visa getById(@PathVariable int visaId) {
		return service.getVisaById(visaId);
	}

	@GetMapping("visa")
	public List<Visa> findAllVisa() {
		return service.getAllVisa();
	}
	
	@PutMapping("visa/{visaId}")
	public Visa updateVisa(@PathVariable int visaId, @RequestBody Visa visa) {
		return service.updateVisa(visaId, visa);
	}
	
	@DeleteMapping("visa/{visaId}")
	public boolean deleteVisa(@PathVariable int visaId) {
		return service.deleteVisaStatus(visaId);
	}
}

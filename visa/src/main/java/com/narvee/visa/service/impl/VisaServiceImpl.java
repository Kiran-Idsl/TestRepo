package com.narvee.visa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.narvee.visa.entity.Visa;
import com.narvee.visa.repository.VisaRepository;
import com.narvee.visa.service.VisaService;

@Service
public class VisaServiceImpl implements VisaService {

	@Autowired
	private VisaRepository repository;

	@Override
	public Visa saveVisa(Visa visa) {
		return repository.save(visa);
	}

	@Override
	public Visa getVisaById(long visaId) {
		return repository.findById(visaId).get();
	}

	@Override
	public List<Visa> getAllVisa() {
		return repository.findAll();
	}

	@Override
	public Visa updateVisa(long visaId, Visa visa) {
		Visa existingVisa = getVisaById(visaId);
		existingVisa.setStatus(visa.getStatus());
		existingVisa.setDescription(visa.getDescription());
		return repository.save(existingVisa);

	}

	@Override
	public boolean deleteVisaStatus(long visaId) {
		Visa visa = getVisaById(visaId);
		if (visa != null) {
			repository.delete(visa);
			return true;
		}
		return false;
	}

}

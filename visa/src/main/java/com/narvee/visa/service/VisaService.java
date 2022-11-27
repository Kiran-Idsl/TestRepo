package com.narvee.visa.service;

import java.util.List;

import com.narvee.visa.entity.Visa;

public interface VisaService {
	public Visa saveVisa(Visa visa);
	public Visa getVisaById(long visaId);
	public List<Visa> getAllVisa();
	public Visa updateVisa(long visaId, Visa visa);
	public boolean deleteVisaStatus(long visaId);
}

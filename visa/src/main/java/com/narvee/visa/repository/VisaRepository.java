package com.narvee.visa.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.narvee.visa.entity.Visa;

public interface VisaRepository extends JpaRepository<Visa, Serializable>{

}

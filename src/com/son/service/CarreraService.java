package com.son.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.son.domain.Carrera;
import com.son.repository.CarreraRepository;

@Service
public class CarreraService {
	
	@Autowired
	private CarreraRepository carreraRepository;
	
	public Carrera findByIdCarrera(int id){
		return carreraRepository.findByIdCarrera(id);
	}
	
}

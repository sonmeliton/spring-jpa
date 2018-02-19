package com.son.repository;

import org.springframework.data.repository.CrudRepository;

import com.son.domain.Carrera;

public interface CarreraRepository extends CrudRepository<Carrera, Integer> {
	public Carrera findByIdCarrera(int id);
}

package com.son.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.son.domain.Asignatura;

public interface AsignaturaRepository extends CrudRepository<Asignatura, Integer> {
	
	public List<Asignatura> findByNombreAsignaturaLike(String nombre);
	public Asignatura findByIdAsignatura(int id);
	public Integer deleteByNombreAsignatura(String nombre);
	public List<Asignatura> findByCarrera_NombreCarrera(String nombre);
	public List<Asignatura> findByCarrera_NombreCarreraAndCarrera_IdCarrera(String nombre, int id);
	public Page<Asignatura> findAll(Pageable pageable);
	public Page<Asignatura> findByNombreAsignaturaLike(String nombre, Pageable pageable);
	
}

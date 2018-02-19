package com.son.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.son.domain.Asignatura;
import com.son.repository.AsignaturaRepository;

@Service
public class AsignaturaService {
	
	private static final int ITEMS_PER_PAGE = 4;
	
	@Autowired
	private AsignaturaRepository asignaturaRepository;
	
	public void save(Asignatura asignatura) {
		asignaturaRepository.save(asignatura);
	}
	
	public void save(List<Asignatura> asignatura) {
		asignaturaRepository.save(asignatura);
	}
	
	public Asignatura findOne(int id) {
		return asignaturaRepository.findOne(id);
	}
	
	public List<Asignatura> findAll() {
		return (List<Asignatura>) asignaturaRepository.findAll();
	}
	
	public boolean exists(int id) {
		return asignaturaRepository.exists(id);
	}
	
	public List<Asignatura> findByNombreAsignaturaLike(String nombre) {
		return (List<Asignatura>) asignaturaRepository.findByNombreAsignaturaLike("%" + nombre + "%");
	}
	
	public Asignatura findByIdAsignatura(int id) {
		return asignaturaRepository.findByIdAsignatura(id);
	}
	
	@Transactional
	public Integer deleteByNombreAsignatura(String nombre) {
		return asignaturaRepository.deleteByNombreAsignatura(nombre);
	}
	
	public List<Asignatura> findByCarrera_NombreCarrera(String nombre) {
		return asignaturaRepository.findByCarrera_NombreCarrera(nombre);
	}
	
	public List<Asignatura> findByCarrera_NombreCarreraAndCarrera_IdCarrera(String nombre, int id) {
		return asignaturaRepository.findByCarrera_NombreCarreraAndCarrera_IdCarrera(nombre, id);
	}
	
	public Page<Asignatura> findAll(int index) {
		return asignaturaRepository.findAll(new PageRequest(index, ITEMS_PER_PAGE, Direction.ASC, "idAsignatura"));
	}
	
	public Page<Asignatura> findByNombreAsignaturaLike(int index, String nombre) {
		return asignaturaRepository.findByNombreAsignaturaLike(nombre, new PageRequest(index, ITEMS_PER_PAGE, Direction.ASC, "idAsignatura"));
	}
	
}

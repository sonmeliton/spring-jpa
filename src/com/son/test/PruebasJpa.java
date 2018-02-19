package com.son.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;

import com.son.domain.Asignatura;
import com.son.domain.Carrera;
import com.son.service.AsignaturaService;
import com.son.service.CarreraService;

public class PruebasJpa {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
		
		AsignaturaService asignaturaService = context.getBean(AsignaturaService.class);
		//System.out.println( asignaturaService.findOne(3) );
		//System.out.println( asignaturaService.findAll() );
		//System.out.println( asignaturaService.exists(1) );
		//System.out.println( asignaturaService.findByNombreAsignaturaLike("introduccion") );
		//System.out.println( asignaturaService.findByIdAsignatura(4) );
		//System.out.println( asignaturaService.deleteByNombreAsignatura("poo") );
		
		
		CarreraService carreraService = context.getBean(CarreraService.class);
		
		/*Carrera carrera = carreraService.findByIdCarrera(1);
		Asignatura asignatura = new Asignatura("sistemas operativos");
		asignatura.setCarrera(carrera);
		asignaturaService.save( asignatura );
		asignaturaService.save(asignatura);*/
		
		/*
		List<Asignatura> asignaturas = asignaturaService.findByCarrera_NombreCarrera("programacion");
		System.out.println(asignaturas);*/
		
		/*
		List<Asignatura> asignaturas = asignaturaService.findByCarrera_NombreCarreraAndCarrera_IdCarrera("programacion", 1);
		System.out.println(asignaturas);*/
		
		/*
		int index = 1;
		Page<Asignatura> page = asignaturaService.findAll(index - 1);
		System.out.println("Pagina: " + index);
		System.out.println("Total paginas: " + page.getTotalPages());
		System.out.println("Contenido: " + page.getContent());*/
		
		/*
		int index = 1;
		Page<Asignatura> page = asignaturaService.findByNombreAsignaturaLike(index - 1, "%avanz%");
		System.out.println("Pagina: " + index);
		System.out.println("Total de elementos: " + page.getTotalElements());
		System.out.println("Total paginas: " + page.getTotalPages());
		System.out.println("Contenido: " + page.getContent());*/
		
		
		
		((ClassPathXmlApplicationContext)context).close();
	}

}

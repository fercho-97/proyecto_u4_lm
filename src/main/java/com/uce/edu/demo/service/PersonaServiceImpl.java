package com.uce.edu.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IPersonaRepository;
import com.uce.edu.demo.repository.modelo.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaRepository iPersonaJpaRepository;

	@Override
	public void guardar(Persona persona) {
		// TODO Auto-generated method stub
		this.iPersonaJpaRepository.insetar(persona);
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		this.iPersonaJpaRepository.actualizar(persona);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iPersonaJpaRepository.eliminar(id);
	}

	@Override
	public Persona buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iPersonaJpaRepository.buscarPorId(id);
	}

	@Override
	public List<Persona> buscarTodos() {
		// TODO Auto-generated method stub
		return this.iPersonaJpaRepository.buscarTodos();
	}

}

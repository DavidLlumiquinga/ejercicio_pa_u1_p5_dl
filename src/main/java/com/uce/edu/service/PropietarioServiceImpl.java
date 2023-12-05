package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.matricula.repository.IPropietarioRepository;
import com.uce.edu.matricula.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements IPropietarioService{

	@Autowired
	public IPropietarioRepository iPropietarioRepository;
	@Override
	public Propietario guardar(String codigo) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepository.seleccionar(codigo);
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.actualizar(propietario);
	}

	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.ingresar(propietario);
	}

	@Override
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		this.iPropietarioRepository.eliminar(codigo);
	}

}

package com.uce.edu.service;

import com.uce.edu.matricula.repository.modelo.Propietario;

public interface IPropietarioService {

	public Propietario guardar(String codigo);
	public void actualizar(Propietario propietario);
	public void insertar(Propietario propietario);
	public void eliminar(String codigo);
}






package com.uce.edu.matricula.repository;

import com.uce.edu.matricula.repository.modelo.Propietario;

public interface IPropietarioRepository {

	public Propietario seleccionar(String codigo);
	public void actualizar(Propietario propietario);
	public void ingresar(Propietario propietario);
	public void eliminar(String codigo);
	
}

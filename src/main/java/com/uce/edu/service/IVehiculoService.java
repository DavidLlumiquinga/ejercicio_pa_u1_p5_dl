package com.uce.edu.service;

import com.uce.edu.matricula.repository.modelo.Vehiculo;

public interface IVehiculoService {
	
	public Vehiculo guardar(String codigo);

	public void actualizar(Vehiculo vehiculo);

	public void insertar(Vehiculo vehiculo);

	public void eliminar(String codigo);
	
}

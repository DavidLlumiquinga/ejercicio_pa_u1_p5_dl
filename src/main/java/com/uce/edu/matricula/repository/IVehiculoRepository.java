package com.uce.edu.matricula.repository;

import com.uce.edu.matricula.repository.modelo.Vehiculo;

public interface IVehiculoRepository {

	
	public Vehiculo seleccionar(String codigo);
	public void actualizar(Vehiculo vehiculo);
	public void ingresar(Vehiculo vehiculo);
	public void eliminar(String codigo);
}

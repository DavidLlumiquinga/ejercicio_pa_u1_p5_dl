package com.uce.edu.service;

import com.uce.edu.matricula.repository.modelo.Matricula;

public interface IMatriculaService {
	public Matricula guardar(String codigo);
	public void actualizar(Matricula matricula);
	public void insertar(Matricula matricula);
	public void eliminar(String codigo);
	public void matriculacion(String cedula, String placa);
}

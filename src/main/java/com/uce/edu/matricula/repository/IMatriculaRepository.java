package com.uce.edu.matricula.repository;

import com.uce.edu.matricula.repository.modelo.Matricula;

public interface IMatriculaRepository {
	public Matricula  seleccionar(String codigo);
	public void actualizar(Matricula matricula);
	public void ingresar(Matricula matricula);
	public void eliminar(String codigo);

}

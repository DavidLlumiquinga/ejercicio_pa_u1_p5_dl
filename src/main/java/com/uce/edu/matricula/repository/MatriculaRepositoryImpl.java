package com.uce.edu.matricula.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.matricula.repository.modelo.Matricula;
import com.uce.edu.matricula.repository.modelo.Propietario;
import com.uce.edu.matricula.repository.modelo.Vehiculo;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {

	public List<Matricula> base = new ArrayList<Matricula>();

	@Override
	public Matricula seleccionar(String codigo) {
		// TODO Auto-generated method stub
		for (Matricula matricula : base) {
			Matricula matri = new Matricula();
			if (matri.getCodigo().equals(codigo)) {
				matri.setCodigo(matricula.getCodigo());
				matri.setFechaMatricula(matricula.getFechaMatricula());
				matri.setPropietario(matricula.getPropietario());
				matri.setValorMatricula(matricula.getValorMatricula());
				matri.setVehiculo(matricula.getVehiculo());
				return matri;
			}
		}
		return null;
	}

	public Matricula seleccionarEliminar(String codigo) {

		for (Matricula matricula : base) {

			if(matricula.getCodigo().equals(codigo))
			

			return matricula;
		}
		return null;
	}
	


	@Override
	public void actualizar(Matricula matricula) {
		base.add(matricula);

	}

	@Override
	public void ingresar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.seleccionar(matricula.getCodigo());
		this.eliminar(matricula.getCodigo());
	}

	@Override
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		Matricula matricula=this.seleccionarEliminar(codigo);
		base.remove(matricula);
	}

}

package com.uce.edu.matricula.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.matricula.repository.modelo.Matricula;
import com.uce.edu.matricula.repository.modelo.Propietario;
import com.uce.edu.matricula.repository.modelo.Vehiculo;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	public List<Propietario> base=new ArrayList<Propietario>();	
	@Override
	public Propietario seleccionar(String codigo) {
		// TODO Auto-generated method stub
		for(Propietario propietario: base) {
			Propietario propi=new Propietario();
			if(propi.getNombre().equals(codigo)) {
				propi.setApellido(propietario.getApellido());
				propi.setCedula(propietario.getCedula());
				propi.setGenero(propietario.getGenero());
				propi.setNombre(propietario.getNombre());
				return propi;
			}
		}
		return null;
		
	}
	public Propietario seleccionarEliminar(String codigo) {

		for (Propietario propietario : base) {

			if(propietario.getCedula().equals(codigo))
			

			return propietario;
		}
		return null;
	}


	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		base.add(propietario);
	}

	@Override
	public void ingresar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.seleccionar(propietario.getCedula());
		this.eliminar(propietario.getCedula());
	}

	@Override
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		Propietario propietario=this.seleccionarEliminar(codigo);
		base.remove(propietario);
		
	}

}

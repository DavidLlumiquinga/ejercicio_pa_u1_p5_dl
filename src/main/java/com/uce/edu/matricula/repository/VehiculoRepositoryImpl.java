package com.uce.edu.matricula.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.matricula.repository.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository{

	public List<Vehiculo> base=new ArrayList<Vehiculo>();	
	
	@Override
	public Vehiculo seleccionar(String codigo) {
		// TODO Auto-generated method stub
		for(Vehiculo vehiculo: base) {
			Vehiculo vehi=new Vehiculo();
			if(vehi.getPlaca().equals(codigo)) {
				vehi.setMarca(vehiculo.getMarca());
				vehi.setPlaca(vehiculo.getPlaca());
				vehi.setPrecio(vehiculo.getPrecio());
				vehi.setTipo(vehiculo.getTipo());
				return vehi;
			}
		}
		return null;
	}
	public Vehiculo seleccionarEliminar(String codigo) {

		for (Vehiculo vehiculo : base) {

			if(vehiculo.getPlaca().equals(codigo))
			

			return vehiculo;
		}
		return null;
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		base.add(vehiculo);
	}

	@Override
	public void ingresar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.seleccionar(vehiculo.getPlaca());
		this.eliminar(vehiculo.getPlaca());
	}

	@Override
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo=this.seleccionarEliminar(codigo);
		base.remove(vehiculo);
		
	}



	
	
}

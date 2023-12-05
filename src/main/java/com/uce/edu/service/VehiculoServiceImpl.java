package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.matricula.repository.IVehiculoRepository;
import com.uce.edu.matricula.repository.modelo.Vehiculo;

@Service
public class VehiculoServiceImpl  implements IVehiculoService{

	@Autowired
	public IVehiculoRepository iVehiculoRepository;
	@Override
	public Vehiculo guardar(String codigo) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepository.seleccionar(codigo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.actualizar(vehiculo);
	}

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.ingresar(vehiculo);
	}

	@Override
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepository.eliminar(codigo);
	}

}

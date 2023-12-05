package com.uce.edu.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.matricula.repository.IMatriculaRepository;
import com.uce.edu.matricula.repository.IPropietarioRepository;
import com.uce.edu.matricula.repository.IVehiculoRepository;
import com.uce.edu.matricula.repository.modelo.Matricula;
import com.uce.edu.matricula.repository.modelo.Propietario;
import com.uce.edu.matricula.repository.modelo.Vehiculo;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	public IMatriculaRepository iMatriculaRepository;
	@Autowired
	public IVehiculoRepository iVehiculoRepository;
	@Autowired
	public IPropietarioRepository iPropietarioRepository;
	
	@Override
	public Matricula guardar(String codigo) {
		// TODO Auto-generated method stub
		return this.iMatriculaRepository.seleccionar(codigo);
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.iMatriculaRepository.actualizar(matricula);
	}

	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		this.iMatriculaRepository.ingresar(matricula);
	}

	@Override
	public void eliminar(String codigo) {
		// TODO Auto-generated method stub
		this.iMatriculaRepository.eliminar(codigo);
	}

	@Override
	public void matriculacion(String cedula, String placa) {
		
		Vehiculo vehi = this.iVehiculoRepository.seleccionar(placa);
		Propietario propie = this.iPropietarioRepository.seleccionar(cedula);
		

		Matricula matri = new Matricula();
		matri.setPropietario(propie);
		matri.setVehiculo(vehi);
		matri.setFechaMatricula(LocalDate.now());
		

		String op = vehi.getTipo();

		switch (op) {
		case "pesado": {

			matri.setValorMatricula(matri.getVehiculo().getPrecio().multiply(new BigDecimal(0.25)));
			System.out.println("Sin descuento "+matri);
			if (matri.getValorMatricula().compareTo(new BigDecimal(2200)) > 0) {
				BigDecimal descuento = matri.getValorMatricula().multiply(new BigDecimal(0.5));
				matri.setValorMatricula(matri.getValorMatricula().subtract(descuento));
			
				// this.iMatriculaRepository.actualizar(matri);
				System.out.println("Con descuento "+matri);
			}
			break;
		}
		case "liviano": {

			matri.setValorMatricula(matri.getVehiculo().getPrecio().multiply(new BigDecimal(0.2)));
			System.out.println("Sin descuento "+matri);
			if (matri.getValorMatricula().compareTo(new BigDecimal(2200)) > 0) {
				BigDecimal descuento = matri.getValorMatricula().multiply(new BigDecimal(0.5));
				matri.setValorMatricula(matri.getValorMatricula().subtract(descuento));
				// this.iMatriculaRepository.actualizar(matri);
				System.out.println("Con descuento "+matri);
			}
			break;
		}

		}
		this.iMatriculaRepository.ingresar(matri);
	}

}


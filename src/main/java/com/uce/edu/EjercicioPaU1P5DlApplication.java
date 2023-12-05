package com.uce.edu;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.matricula.repository.IPropietarioRepository;
import com.uce.edu.matricula.repository.IVehiculoRepository;
import com.uce.edu.matricula.repository.modelo.Matricula;
import com.uce.edu.matricula.repository.modelo.Propietario;
import com.uce.edu.matricula.repository.modelo.Vehiculo;
import com.uce.edu.service.IMatriculaService;

@SpringBootApplication
public class EjercicioPaU1P5DlApplication implements CommandLineRunner{

	@Autowired
	public IMatriculaService iMatriculaService
	;
	@Autowired
	public IVehiculoRepository iVehiculoRepository;
	@Autowired
	public IPropietarioRepository iPropietarioRepository;
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU1P5DlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Vehiculo vehiculo=new Vehiculo();
		vehiculo.setMarca("Audi");
		vehiculo.setPlaca("KKK-999");
		vehiculo.setPrecio(new BigDecimal(25000));
		vehiculo.setTipo("liviano");
		System.out.println(vehiculo);
		
		Propietario propietario=new Propietario();
		propietario.setNombre("David");
		propietario.setApellido("Llumiquinga");
		propietario.setGenero("Masculino");
		propietario.setCedula("1725698911");
		System.out.println(propietario);
		
		Matricula matricula=new Matricula();
		matricula.setPropietario(propietario);
		matricula.setVehiculo(vehiculo);
		
		this.iMatriculaService.matriculacion("1725698911", "KKK-999");
		
		
		
		
	}

}

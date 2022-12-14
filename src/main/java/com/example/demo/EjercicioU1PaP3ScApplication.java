package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.service.IGestorMatriculaService;
import com.example.demo.service.IPropietarioService;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication

public class EjercicioU1PaP3ScApplication implements CommandLineRunner{

	@Autowired
	private IGestorMatriculaService iGestorMatriculaService;
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired
	private IPropietarioService iPropietarioService;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioU1PaP3ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Vehiculo vehiculo1 =new Vehiculo();
		vehiculo1.setMarca("toyota");
		vehiculo1.setPlaca("001");
		vehiculo1.setPrecio(new BigDecimal(100));
		vehiculo1.setTipo("liviano");
		this.iVehiculoService.insertar(vehiculo1);
		
		Vehiculo vehiculo2 =new Vehiculo();
		vehiculo2.setMarca("nisan");
		vehiculo2.setPlaca("002");
		vehiculo2.setPrecio(new BigDecimal(10000));
		vehiculo2.setTipo("pesado");
		this.iVehiculoService.insertar(vehiculo2);
		
		Propietario propietario =new Propietario();
		propietario.setApellidos("chango");
		propietario.setCedula("123");
		propietario.setFechaNacimiento(LocalDateTime.now());
		propietario.setNombre("santiago");
		this.iPropietarioService.insertar(propietario);
		

		System.out.println(	this.iGestorMatriculaService.matricula("123", "001"));
		
		
		
		
		
	}

}

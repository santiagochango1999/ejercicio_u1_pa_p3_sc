package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.GestorMatricula;
import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IGestorMatriculaRepository;

@Service
public class GestorMatriculaImpl implements IGestorMatriculaService{

	@Autowired
	private IGestorMatriculaRepository iGestorMatriculaRepository;
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	@Autowired 
	private IPropietarioService iPropietarioService;
	
	@Override
	public GestorMatricula matricula(String cedula, String placa) {
		
		Vehiculo vehiculo=this.iVehiculoService.buscar(placa);
		Propietario propietario= this.iPropietarioService.buscar(cedula);
		
		GestorMatricula gestorMatricula=new GestorMatricula();
		gestorMatricula.setFecha( LocalDateTime.now());
		gestorMatricula.setPropietario(propietario);
		gestorMatricula.setVehiculo(vehiculo);
		
		if(vehiculo.getTipo().equals("pesado")) {
			
			gestorMatricula.setValorDeMatricula(vehiculo.getPrecio().multiply(new BigDecimal(0.15)));
			
		}if(vehiculo.getTipo().equals("liviano")) {
			
			gestorMatricula.setValorDeMatricula(vehiculo.getPrecio().multiply(new BigDecimal(0.10)));
		}
		
		if(gestorMatricula.getValorDeMatricula()== new BigDecimal(2000)) {
			BigDecimal i=new BigDecimal(0);
			i=gestorMatricula.getValorDeMatricula().multiply(new BigDecimal(0.7));
			gestorMatricula.setValorDeMatricula(gestorMatricula.getValorDeMatricula().subtract(i));
		}
		
		
		
		
		return gestorMatricula;
	}

}

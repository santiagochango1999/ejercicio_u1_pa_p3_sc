package com.example.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GestorMatricula {
	
	private Vehiculo vehiculo;
	private Propietario propietario;
	private LocalDateTime fecha;
	private BigDecimal valorDeMatricula;
	
	
	
	@Override
	public String toString() {
		return "GestorMatricula [vehiculo=" + vehiculo + ", propietario=" + propietario + ", fecha=" + fecha
				+ ", valorDeMatricula=" + valorDeMatricula + "]";
	}
	//METODOS GET Y SET
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public BigDecimal getValorDeMatricula() {
		return valorDeMatricula;
	}
	public void setValorDeMatricula(BigDecimal valorDeMatricula) {
		this.valorDeMatricula = valorDeMatricula;
	}
	
	
	
	
}

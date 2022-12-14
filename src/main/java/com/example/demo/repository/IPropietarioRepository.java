package com.example.demo.repository;

import com.example.demo.modelo.Propietario;

public interface IPropietarioRepository {
	
	public Propietario buscar(String cedula);
	public void insertar(Propietario propietario);
	public void borrar(String nombre);
	public void actualizar(Propietario propietario);
}

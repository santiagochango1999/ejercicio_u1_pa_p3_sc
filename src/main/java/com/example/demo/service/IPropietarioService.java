package com.example.demo.service;

import com.example.demo.modelo.Propietario;

public interface IPropietarioService {
	public Propietario buscar(String cedula);
	public void insertar(Propietario propietario);
	public void borrar(String nombre);
	public void actualizar(Propietario propietario);
}

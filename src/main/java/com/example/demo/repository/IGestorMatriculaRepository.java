package com.example.demo.repository;

import com.example.demo.modelo.GestorMatricula;
import com.example.demo.modelo.Propietario;

public interface IGestorMatriculaRepository {
	
	public GestorMatricula buscar(Integer id);
	public void insertar(GestorMatricula gestion);
	public void borrar(Integer id);
	public void actualizar(GestorMatricula gestion);
}

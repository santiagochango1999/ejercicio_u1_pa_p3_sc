package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.GestorMatricula;

@Repository
public class GestorMatriculaRepositoryImp implements IGestorMatriculaRepository{

	private List<GestorMatricula> baseGestor=new ArrayList<>();
	@Override
	public GestorMatricula buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertar(GestorMatricula gestion) {
		// TODO Auto-generated method stub
		baseGestor.add(gestion);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(GestorMatricula gestion) {
		// TODO Auto-generated method stub
		
	}

}

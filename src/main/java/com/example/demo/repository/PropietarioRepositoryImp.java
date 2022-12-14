package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Propietario;
import com.example.demo.modelo.Vehiculo;

@Repository
public class PropietarioRepositoryImp implements IPropietarioRepository{

	private List<Propietario> basePropietario= new ArrayList<>();
	@Override
	public Propietario buscar(String cedula) {
		Propietario propietario=new Propietario();
		for(Propietario p:basePropietario) {
			if(p.getCedula().equals(cedula)) {
				propietario=p;
				System.out.println("se a encontrado vehiculo");
			}
		}
		
		return  propietario;
	}

	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		System.out.println("guardado en la base de datos");
		basePropietario.add(propietario);
	}

	@Override
	public void borrar(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("se a eliminado");
		Propietario propietario=new Propietario();
		for(Propietario p:basePropietario) {
			if(p.getNombre().equals(nombre)) {
				propietario=p;
			}
		}
		
		basePropietario.remove(propietario);
		
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		
	}

}

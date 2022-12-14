package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImp implements IVehiculoRepository{

	private List<Vehiculo> baseVehiculo= new ArrayList<>();
	@Override
	
	public Vehiculo buscar(String placa) {
		
		Vehiculo vehiculo=new Vehiculo();
		for(Vehiculo v:baseVehiculo) {
			if(v.getPlaca().equals(placa)) {
				vehiculo=v;
				System.out.println("se a encontrado vehiculo");
			}
		}
		
		return  vehiculo;
	}

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("guardado en la base de datos");
		baseVehiculo.add(vehiculo);
	}

	@Override
	public void borrar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("se a eliminado");
		Vehiculo vehiculo=new Vehiculo();
		for(Vehiculo v:baseVehiculo) {
			if(v.getPlaca().equals(placa)) {
				vehiculo=v;
			}
		}
		
		baseVehiculo.remove(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo1=null;
		for(Vehiculo v:baseVehiculo) {
			if(v.getMarca().equals(vehiculo.getMarca())) {
				vehiculo1=v;
			}
			baseVehiculo.remove(v);
			baseVehiculo.add(vehiculo1);
		}
		System.out.println("actualizado");
		
	}

	@Override
	public void actualizarDos(String marca, String placa) {
		
		Vehiculo vehiculo=null;
		for(Vehiculo v:baseVehiculo) {
			if(v.getMarca().equals(marca)&&v.getPlaca().equals(placa)) {
				vehiculo=v;
			}
			baseVehiculo.remove(v);
			baseVehiculo.add(vehiculo);
		}
		System.out.println("se actualizado");
		
	}

}

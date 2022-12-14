package com.example.demo.repository;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoRepository {
	
	public Vehiculo buscar(String placa);
	public void insertar(Vehiculo vehiculo);
	public void borrar(String placa);
	public void actualizar(Vehiculo vehiculo);
	public void actualizarDos(String marca,String placa);

}

package es.redmetro.dao;

import java.util.List;

import es.redmetro.excepciones.RedMetroExcepciones;

public interface IRedMetro<T>{
	
	public void crear(T entidad);
	public void borrar(T entidad);
	public void actualizar(T entidad);
	public T buscarporID(int codigo);
	public List<T> getLista();
	

}

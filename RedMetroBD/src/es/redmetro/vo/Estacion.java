package es.redmetro.vo;

import java.util.List;

public class Estacion {

	private int codigoEstacion;
	private String nombre;
	private String direccion;
	private List<Acceso>accesos;
	private List<LineaEstacion>lineasEstacion;
	

	public int getCodigoEstacion() {
		return codigoEstacion;
	}

	public void setCodigoEstacion(int codigoEstacion) {
		this.codigoEstacion = codigoEstacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Acceso> getAccesos() {
		return accesos;
	}

	public void setAccesos(List<Acceso> accesos) {
		this.accesos = accesos;
	}

	public List<LineaEstacion> getLineasEstacion() {
		return lineasEstacion;
	}

	public void setLineasEstacion(List<LineaEstacion> lineasEstacion) {
		this.lineasEstacion = lineasEstacion;
	}
	
}

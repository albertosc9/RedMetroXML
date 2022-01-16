package es.redmetro.vo;

import java.util.List;

public class Cochera {

	private int codigoCochera;
	private String nombre;
	private String direccion;
	private int deposito;
	private List<Tren>trenes;
	
	public int getCodigoCochera() {
		return codigoCochera;
	}

	public void setCodigoCochera(int codigoCochera) {
		this.codigoCochera = codigoCochera;
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

	public int getDeposito() {
		return deposito;
	}

	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}

	public List<Tren> getTrenes() {
		return trenes;
	}

	public void setTrenes(List<Tren> trenes) {
		this.trenes = trenes;
	}
	
}

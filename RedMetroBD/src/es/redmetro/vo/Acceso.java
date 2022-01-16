package es.redmetro.vo;

public class Acceso {

	private int codigoAcceso;
	private String nombre;
	private int accesoDiscapacidad;
	private Estacion estacion;
	

	public int getCodigoAcceso() {
		return codigoAcceso;
	}

	public void setCodigoAcceso(int codigoAcceso) {
		this.codigoAcceso = codigoAcceso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAccesoDiscapacidad() {
		return accesoDiscapacidad;
	}

	public void setAccesoDiscapacidad(int accesoDiscapacidad) {
		this.accesoDiscapacidad = accesoDiscapacidad;
	}

	public Estacion getEstacion() {
		return estacion;
	}

	public void setEstacion(Estacion estacion) {
		this.estacion = estacion;
	}
}

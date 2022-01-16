package es.redmetro.vo;

import java.util.Date;
import java.util.List;

public class Linea {

	private int codigoLinea;
	private String nombreCorto;
	private String nombreLargo;
	private Date fechaInaguracion;
	private float Km;
	private Color color;
	private List<LineaEstacion>lineasEstacion;
	
	

	public int getCodigoLinea() {
		return codigoLinea;
	}

	public void setCodigoLinea(int codigoLinea) {
		this.codigoLinea = codigoLinea;
	}

	
	public Date getFechaInaguracion() {
		return fechaInaguracion;
	}

	public void setFechaInaguracion(Date fechaInaguracion) {
		this.fechaInaguracion = fechaInaguracion;
	}

	public float getKm() {
		return Km;
	}

	public void setKm(int km) {
		Km = km;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getNombreCorto() {
		return nombreCorto;
	}

	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}

	public String getNombreLargo() {
		return nombreLargo;
	}

	public void setNombreLargo(String nombreLargo) {
		this.nombreLargo = nombreLargo;
	}

	public List<LineaEstacion> getLineasEstacion() {
		return lineasEstacion;
	}

	public void setLineasEstacion(List<LineaEstacion> lineasEstacion) {
		this.lineasEstacion = lineasEstacion;
	}
}

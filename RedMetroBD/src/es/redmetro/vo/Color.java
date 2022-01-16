package es.redmetro.vo;

public class Color {

	private int codigoColor;
	private String nombreColor;
	private String codigoHexadecimal;
	

	public int getCodigoColor() {
		return codigoColor;
	}

	public void setCodigoColor(int codigoColor) {
		this.codigoColor = codigoColor;
	}

	public String getNombreColor() {
		return nombreColor;
	}

	public void setNombreColor(String nombreColor) {
		this.nombreColor = nombreColor;
	}

	public String getCodigoHexadecimal() {
		return codigoHexadecimal;
	}

	public void setCodigoHexadecimal(String codigoHexadecimal) {
		this.codigoHexadecimal = codigoHexadecimal;
	}

	@Override
	public String toString() {
		return "codigoColor=" + codigoColor + ", nombreColor=" + nombreColor + ", codigoHexadecimal="
				+ codigoHexadecimal + "]";
	}
}

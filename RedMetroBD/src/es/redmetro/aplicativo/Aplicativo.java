package es.redmetro.aplicativo;

import java.util.Date;
import java.util.List;

import es.redmetro.dao.IRedMetro;
import es.redmetro.dao.hibernate.CocheraHibernate;
import es.redmetro.dao.hibernate.ColorHibernate;
import es.redmetro.dao.hibernate.LineaHibernate;
import es.redmetro.utilidades.UtilidadHibernate;
import es.redmetro.vo.Cochera;
import es.redmetro.vo.Color;
import es.redmetro.vo.Linea;

public class Aplicativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UtilidadHibernate.getSession();
		//procesamientoDatos();
		
	}
	public static void procesamientoDatos() {
		
		IRedMetro tratamiento = new CocheraHibernate();
		IRedMetro accionesColor = new ColorHibernate();
		IRedMetro accionesLinea = new LineaHibernate();
		
		
		Cochera cochera = new Cochera();
		Linea linea = new Linea();
		Color color = new Color();
		
//		
		cochera.setCodigoCochera(1);
		cochera.setDireccion("avenida san luis");
		cochera.setNombre("cochera EMT");
		cochera.setDeposito(0);
		
		tratamiento.crear(cochera);

		/**
		color =   (Color) accionesColor.buscarporID(4);
		System.out.println(color.getCodigoColor()+" nombre color: "+color.getNombreColor());
		
		linea.setCodigoLinea(5);
		linea.setColor(color);
		linea.setFechaInaguracion(new Date());
		linea.setKm(7);
		linea.setNombreCorto("Linea 4");
		linea.setNombreLargo("Argüelles-Pinar de Chamartín");
		
		//accionesLinea.crear(linea);
		 **/
		List<Color>colores = accionesColor.getLista();
		
		
		for (Color cl : colores) {
			System.out.println(cl);
		}
	
	}
}

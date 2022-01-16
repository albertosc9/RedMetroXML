package es.redmetro.dao.hibernate;

import java.util.List;

import org.hibernate.Session;

import es.redmetro.dao.IRedMetro;
import es.redmetro.utilidades.UtilidadHibernate;
import es.redmetro.vo.Cochera;
import es.redmetro.vo.Color;

public class ColorHibernate implements IRedMetro<Color>{

	private Session sesion;
	@Override
	public void crear(Color entidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Color entidad) {
		// TODO Auto-generated method stub
		sesion = UtilidadHibernate.getSession();
		
		if (sesion!=null) {
			
		}
	}

	@Override
	public void actualizar(Color entidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Color buscarporID(int codigo) {
	Color color=null;
		
	
		sesion = UtilidadHibernate.getSession();
		
		if (sesion!=null) {
			color = sesion.get(Color.class, codigo);
			
			
		}
		sesion.close();
		
	
		return color;
	}

	@Override
	public List<Color> getLista() {
		List<Color>colores = null;
		
		sesion = UtilidadHibernate.getSession();
		
		if (sesion!=null) {
			colores = sesion.createNativeQuery("SELECT * FROM T_COLOR",Color.class).list();
			
		}
		sesion.close();
		return colores;
	}

}

package es.redmetro.dao.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import es.redmetro.dao.IRedMetro;
import es.redmetro.utilidades.UtilidadHibernate;
import es.redmetro.vo.Cochera;
import es.redmetro.vo.Linea;

public class LineaHibernate implements IRedMetro<Linea>{

	private Session sesion;
	@Override
	public void crear(Linea entidad) {
		// TODO Auto-generated method stub
		Linea linea = null;
		
		sesion=UtilidadHibernate.getSession();
		if (sesion!=null) {
			
			Transaction tx = sesion.beginTransaction();
			
			linea = buscarporID(entidad.getCodigoLinea());
			
			if (linea==null) {
				sesion.save(entidad);
				
				tx.commit();
			}else {
				System.out.println("ya esta la linea");
			}
			
			
			
		
			sesion.close();
			
		}
	}

	@Override
	public void borrar(Linea entidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Linea entidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Linea buscarporID(int codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Linea> getLista() {
		// TODO Auto-generated method stub
		return null;
	}

}

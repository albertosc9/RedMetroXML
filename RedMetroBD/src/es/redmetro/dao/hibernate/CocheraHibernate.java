package es.redmetro.dao.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.internal.build.AllowSysOut;

import es.redmetro.dao.IRedMetro;
import es.redmetro.excepciones.RedMetroExcepciones;
import es.redmetro.utilidades.UtilidadHibernate;
import es.redmetro.vo.Cochera;

public class CocheraHibernate implements IRedMetro<Cochera>{

	
	private Session sesion;
	@Override
	public void crear(Cochera entidad) {
		// TODO Auto-generated method stub
		Cochera cochera = null;
		
		sesion=UtilidadHibernate.getSession();
		if (sesion!=null) {
			
			Transaction tx = sesion.beginTransaction();
			
			cochera = buscarporID(entidad.getCodigoCochera());
			
			if (cochera==null) {
				sesion.save(entidad);
				
				tx.commit();
			}else {
				
				System.out.println("error al introducir la cochera");
				
			}
			
			
			
		
			sesion.close();
			
		}
	}

	@Override
	public void borrar(Cochera entidad) {
		// TODO Auto-generated method stub
		sesion = UtilidadHibernate.getSession();
		
		if (sesion!=null) {
			
			Transaction tx = sesion.beginTransaction();
			
			
			sesion.delete(entidad);

			tx.commit();
			
			sesion.close();
		
		
		}
	}

	@Override
	public void actualizar(Cochera entidad) {
		// TODO Auto-generated method stub
		sesion = UtilidadHibernate.getSession();
		
		if (sesion !=null) {
			Transaction tx = sesion.beginTransaction();
			
			sesion.update(entidad);
			
			tx.commit();
			
			sesion.close();
		}
	}

	@Override
	public Cochera buscarporID(int codigo) {
		// TODO Auto-generated method stub
		
		Cochera cochera=null;
		
		sesion = UtilidadHibernate.getSession();
		
		if (sesion!=null) {
			cochera = sesion.get(Cochera.class, codigo);
			
			
		}
		sesion.close();
		
		return cochera;
	}

	@Override
	public List<Cochera> getLista() {
		// TODO Auto-generated method stub
		List<Cochera>cocheras = null;
		
		sesion = UtilidadHibernate.getSession();
		
		if (sesion!=null) {
			cocheras = sesion.createNativeQuery("SELECT * FROM T_COCHERA",Cochera.class).list();
			
		}
		sesion.close();
		return cocheras;
	}

}

package es.redmetro.excepciones;



public class RedMetroExcepciones extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9048733559503838831L;
	public final static long ERROR_CREAR = 1;
	
	private long codigoError;
	
	

	public long getCodigoError() {
		return codigoError;
	}

	public void setCodigoError(long codigoError) {
		this.codigoError = codigoError;
	}

	public RedMetroExcepciones(long  codigoError, Exception excepcion){
		super(excepcion);
		this.codigoError=codigoError;
	}
	


}

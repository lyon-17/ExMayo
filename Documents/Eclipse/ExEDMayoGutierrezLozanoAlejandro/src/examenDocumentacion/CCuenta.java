package examenDocumentacion;

/**
 * Clase que simula el comportamiento de una cuenta bancaria
 * 
 * @author Alejandro Gutierrez Lozano
 * @version 1.0
 * @see TestCCuenta
 */
public class CCuenta {

	/** nombre de la cuenta */
	private String nombre;
	/** numero de cuenta */
	private String cuenta;
	/** saldo de la cuenta */
	private double saldo;
	/** tipo de interes de la cuenta */
	private double tipoInteres;

	/**
	 * Constructor de cuenta
	 * 
	 * @param nom
	 *            nombre del autor de la cuenta
	 * @param cue
	 *            numero de cuenta
	 * @param sal
	 *            dinero de la cuenta
	 * @param tipo
	 *            tipo de intereses de la cuenta
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
		setTipoInteres(tipo);
	}

	/**
	 * Estado de la cuenta
	 * 
	 * @return el saldo
	 */
	public double estado() {
		return getSaldo();
	}

	/**
	 * Ingresa dinero en la cuenta
	 * 
	 * @param cantidad
	 *            cantidad a ingresar
	 * @throws Exception
	 *             si se introduce una cantidad negativa
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
		setSaldo(getSaldo() + cantidad);
	}

	/**
	 * Retirar dinero de la cuenta
	 * 
	 * @param cantidad
	 *            cantidad a retirar
	 * @throws Exception
	 *             si se introduce una cantidad negativa
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		if (estado() < cantidad) {
			throw new Exception("No se hay suficiente saldo");
		}
		setSaldo(getSaldo() - cantidad);
	}

	/**
	 * Actualiza el saldo
	 * 
	 * @param saldo
	 *            saldo de la cuenta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * devuelve el saldo acutal de la cuenta
	 * 
	 * @return saldo
	 */
	double getSaldo() {
		return saldo;
	}

	/**
	 * Obtiene el autor de la cuenta
	 * 
	 * @return nombre
	 */
	String getNombre() {
		return nombre;
	}

	/**
	 * Cambia el autor de la cuenta
	 * 
	 * @param nombre
	 *            nuevo nombre del autor
	 */
	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * obtiene el numero de cuenta
	 * 
	 * @return cuenta
	 */
	String getCuenta() {
		return cuenta;
	}

	/**
	 * Cambia la cuenta
	 * 
	 * @param cuenta
	 *            nuevo numero de la cuenta
	 */
	void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * obtiene el tipo de interes
	 * 
	 * @return tipoInteres
	 */
	double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Cambia el tipo de interes de la cuenta
	 * 
	 * @param tipoInteres
	 *            nuevo tipo de interes
	 */
	void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}

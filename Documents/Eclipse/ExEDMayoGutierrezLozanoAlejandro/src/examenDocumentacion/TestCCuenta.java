package examenDocumentacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Test para probar una cuenta
 * 
 * @author Alejandro Gutierrez Lozano
 * @version 1.0
 * @see CCuenta
 */
public class TestCCuenta {

	/** dato leido por teclado */
	private static BufferedReader dato;
	/** saldo acutal de la cuenta */
	private static double saldoActual;

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		dato = recogerOpcion();
		CCuenta d13guloa;

		int opcion = 0;
		d13guloa = new CCuenta("Rigoberta Piedra", "0000-6523-85-678912345",
				2500, 0);
		do {
			try {
				opcion = mostrarMenu(dato);

				switch (opcion) {
				case 1:
					float ingresar = ingresar(dato);
					try {
						System.out.println("Ingreso en cuenta");
						d13guloa.ingresar(ingresar);
					} catch (Exception e) {
						System.out.print("Fallo al ingresar");
					}
					break;
				case 2:
					float retirar = retirar(dato);
					try {
						d13guloa.retirar(retirar);
					} catch (Exception e) {
						System.out.print("Fallo al retirar");
					}
					break;
				case 3:
					System.out.println("Aaaaaaaaaadios");
				}
			} catch (IOException ex) {
				Logger.getLogger(TestCCuenta.class.getName()).log(Level.SEVERE,
						null, ex);
			}
		} while (opcion != 3);
		saldoActual = d13guloa.estado();
		System.out.println("Saldo actual: " + saldoActual);
	}

	/**
	 * Retira dinero de la cuenta
	 * 
	 * @param dato
	 *            opcion leida por teclado
	 * @return dinero retirado
	 * @throws IOException
	 *             Si occure algun error al leer la cadena
	 */
	private static float retirar(BufferedReader dato) throws IOException {
		System.out.println("Indica cantidad a retirar: ");
		float retirar = Integer.parseInt(dato.readLine());
		return retirar;
	}

	/**
	 * Ingresa dinero en la cuenta
	 * 
	 * @param dato
	 *            opcion leida por teclado
	 * @return dinero a ingresar
	 * @throws IOException
	 *             Si ocurre algun error al leer la cadena
	 */
	private static float ingresar(BufferedReader dato) throws IOException {
		System.out.println("Indica cantidad a ingresar: ");
		float ingresar = Integer.parseInt(dato.readLine());
		return ingresar;
	}

	/**
	 * Muestra el menu de operaciones
	 * 
	 * @param dato
	 *            opcion leida por teclado
	 * @return la opcion escogida
	 * @throws IOException
	 *             si occure algun error al leer la cadena
	 */
	private static int mostrarMenu(BufferedReader dato) throws IOException {
		int opcion;
		System.out.println("MENU DE OPERACIONES");
		System.out.println("-------------------");
		System.out.println("1 - Ingresar");
		System.out.println("2 - Retirar");
		System.out.println("3 - Salir");
		opcion = Integer.parseInt(dato.readLine());
		return opcion;
	}

	/**
	 * Recoge la opcion
	 * 
	 * @return dato
	 */
	private static BufferedReader recogerOpcion() {
		BufferedReader dato = new BufferedReader(new InputStreamReader(
				System.in));
		return dato;
	}
}

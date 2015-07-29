/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 2
 *------------------------------------------------------------------
 *Autores:
 *Pedro Joaquin Castillo 14224
 *Freddy Jose Ruiz Gatica 14592
 *Boris Cifuentes 14150
 *------------------------------------------------------------------
 *Interface Stack:
 *Esta clase genérica únicamente contiene los métodos genéricos a implementar en la controladora 
 *de la stack.
 * @param <P>: Este parámetro permite establecer el tipo de dato con el que se desea trabajar la 
 * calculadora Stack.
 **/

public interface Calculadora<P> {
	
	/** 
	 * Método: readFile
	 * Funcionalidad: Lectura del archivo de texto, indicándole mediante el parámetro la ubicación del mismo
	 * @param file:Dirección en el computador que indique la ubicación del archivo de texto a leer.
	 */
	public void readFile(String file);
	/**
	 * Método: calcular()
	 * Funcionalidad: PUSH y POP en la stack los valores leídos como el resultado obtenido de operarlos.
	 * @return: El resultado del cálculo en double.
	 */
	public double calcular();
}

/**Universidad Del Valle de Guatemala 
 *Algoritmos y Estructura de Datos 
 *Seccion 10- Hoja de Trabajo 2
 *------------------------------------------------------------------
 *@author
 *Pedro Joaquin Castillo 14224
 *Freddy Jose Ruiz Gatica 14592
 *Boris Cifuentes 14150
 *------------------------------------------------------------------
 *Interface Stack:
 *Esta clase genérica únicamente contiene los métodos genéricos a implementar en la controladora 
 *de la stack.
 * @param <P>: Este parámetro permite establecer el tipo de dato con el que se desea trabajar la 
 * Stack.
 **/
public interface Stack<E> {
	/**
	 *Método: empty()
	 *Funcionalidad: Es el encargado de limpiar la pila.
	 */
	public void empty();
	/**
	 * Método: isEmpty()
	 * Funcionalidad: Este método está encargado de revisar 
	 * si la pila se encuentra vacía.
	 * @return true: vacía / false: No lo está
	 */
	public boolean isEmpty();
	/**
	 * Método: push(E x);
	 * @param x: Valor a almacenar en la pila
	 * Funcionalidad: Es encargado de guardar en la pila el valor ingresado
	 * como parámetro.
	 * 
	 */
	public void push(E x) ;
	/**
	 * Método: pop()
	 * Funcionlidad: 
	 * Es encargado de sacar de la pila el último valor guardado y lo borra de la pila.
	 * @return E
	 * @throws Exception
	 */
	public E pop() throws Exception;
	/**
	 * Método: size()
	 * Funcionalidad:
	 * Retorna el tamaño actual de la pila.
	 * @return int
	 */
	public int size();
	/**
	 * Método: peek()
	 * Funcionalidad:
	 * Retorna el último valor de la pila sin borrarlo de la misma.
	 * @return E
	 * @throws Exception
	 */
	public E peek() throws Exception;
	
}

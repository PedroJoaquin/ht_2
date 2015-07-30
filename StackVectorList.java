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

import java.util.Vector;

public class StackVectorList<E> implements Stack<E>{
	
	/**
	 * Se crea un nuevo objeto de controlador 
	 */
	private Vector<E> controlador = new Vector<E>();

	/* Este metodo limpia el contenido de la pila (vector) 
	 * @see Stack#empty()
	 */
	public void empty() {
		// TODO Auto-generated method stub
		controlador.clear();	
	}

	/* Este metodo indica si la pila (vector) se encuentra vacia 
	 * @see Stack#isEmpty()
	 */
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(controlador.size()>0){
			return true;
		}
		return false; 
	}

	/* Este metodo permite ingresar un valor en la pila 
	 * @see Stack#push(java.lang.Object)
	 */
	public void push(E x) {
		// TODO Auto-generated method stub
		controlador.add(x);		
		System.out.println("El número guaraddo es:"+x);
	}

	/* Este metodo permite obtener el ultimo valor de la pila (vector)
	 * @see Stack#pop()
	 */
	public E pop() throws Exception {
		// TODO Auto-generated method stub
		if(controlador.size()>0){	
			E var = controlador.get(controlador.size()-1);
			controlador.remove(controlador.size()-1);
			return var;
		}
		return null;
	}

	
	/* Este metodo permite conocer el numero de elementos dentro de la pila 
	 * @see Stack#size()
	 */
	public int size() {
		// TODO Auto-generated method stub
		return controlador.size();
	}

	/* Este metodo permite obtener el valor del ultimo elemento guardado en la pila 
	 * @see Stack#peek()
	 */
	public E peek() throws Exception {
		// TODO Auto-generated method stub
		if(controlador.size()>0){
			return controlador.get(controlador.size()-1);	
		}	
		return null;
	}
	
	/**Este metodo permite obtener todos los elementos de la pila (vector) 
	 * @return controlador 
	 */
	public Vector<E> getVector(){
		return controlador;
	}	
}

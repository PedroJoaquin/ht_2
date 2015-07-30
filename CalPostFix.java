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

import java.io.*;

public class CalPostFix implements Calculadora<Double>{
	
	/**
	 * El atributo texto es utilizado para guardar la cadena que viene del archivo de texto
	 * El atributo pila es de tipo StackVectorList y es el vector que se utilizara como pila
	 * El atributo valor retorna el resultado final de las operaciones 
	 */
	String texto = "" ;
	StackVectorList<Double> pila; 
	Double valor;
	
	/**
	 * Constructor de la Clase: Aqui se crea una instancia de la clase StackVectorList
	 * para generar un nuevo vector 
	 */
	public CalPostFix(){
			pila = new StackVectorList<Double>();
	}
	/* Este metodo tiene como funcion leer el archivo de texto y almacenar 
	 * en el atributo texto la cadena leida 
	 * @see Calculadora#readFile(java.lang.String)
	 */
	public void readFile(String file){
        
        try{
        	File archivo = new File (file);
        	FileReader fr= new FileReader(archivo);
        	BufferedReader bf= new BufferedReader(fr);
      
            
            String bfRead;
            while((bfRead = bf.readLine()) != null){ 
                //Se leen las lineas hasta que encuentra una línea en blanco
               //Se almacena poco a poco 
            	texto= bfRead;
            	/*texto=texto+bfRead*/
            }        
        }catch(Exception e){ 
            System.err.println( "ARCHIVO NO ENCONTRADO" );
        }   
    }
    
	/* Con este metodo se lee caracter por caracter la linea alamacenada en texto 
	 * y dependiendo de que carcter se lea se realiza un accion 
	 * @see Calculadora#calcular()
	 */
	public double calcular(){
		//Se declaran variables para usarse dentro del metodo 
		char numero= 0 ;	//Almacena el caracter leido 
		double operando1=0;	//Numero a operar
		double operando2=0;	//Numero a operar 
		
		for(int i=0; i<texto.length();i++){
			numero=texto.charAt(i);
			System.out.println(numero);
			switch (numero){
			
			case '1':	
				pila.push(1.0);
				break;
			case '2' :	
				pila.push(2.0);
			
				break;
			case '3':	
				pila.push(3.0);
			
				break;
			case '4':	
				pila.push(4.0);
			
				break;
			case '5' :	
				pila.push(5.0);
				break;
			case '6' :	
				pila.push(6.0);
				break;
			case '7' :	
				pila.push(7.0);
				break;
			case '8':	
				pila.push(8.0);
				break;
			case  '9' :	
				pila.push(9.0);
				break;
			case '+' :
				try{
				operando2=pila.pop();
				operando1=pila.pop();
				pila.push((operando1+operando2));
				break;
				}
				catch(Exception e){
					break;
				}
			case '-':
				try{
					operando2=pila.pop();
					operando1=pila.pop();
					pila.push((operando1-operando2));
					break;
				}
				catch(Exception e){
					break;
				}
			case '*':
				try{
					operando2=pila.pop();
					operando1=pila.pop();
					pila.push((operando1*operando2));
					break;
				}
				catch(Exception e){
					break;
				}
			case '/':
				try{
					operando2=pila.pop();
					operando1=pila.pop();
					pila.push((operando1/operando2));
					break;
				}
				catch(Exception e){
					break;
				}
			//return pila.pop();
		}
			}
		try{
			valor= new Double(pila.pop());
		}
		catch(Exception e){
		}
		return valor;
	}
	
}


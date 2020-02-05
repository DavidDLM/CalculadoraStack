import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 * @author Mario de Leon
 * @author Mariana Morales
 *
 */
public class Calculadora {
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		CalculadoraFunciones calculadora = new CalculadoraFunciones();
		
		String path = (new File("")).getAbsolutePath()+File.separator+"src"+File.separator+"datos.txt";
		//System.out.println("path: "+path);
		
		File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;

	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File (path);
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	         
	         Stack<String> stackOperadores = new StackArrayList<String>();
	         Stack<Integer> stackValores = new StackArrayList<Integer>();
	         

	         // Lectura del fichero
	         String linea;
	         while((linea=br.readLine())!=null)
	         {
	        	System.out.println(linea);
	        	for(int i=0; i<linea.length(); i++)
	         	{
	        		String caracter = String.valueOf(linea.charAt(i));
	         		System.out.println("caracter: "+caracter);
	         		
	         		//Logica para pasar infix a postfix
	         		
	         		//1. Hay una columna de simbolo que es la columna que va tomando el caracter que se va leyendo, en ese caso este seria el for que ya se hizo
	         		//2. Luego hay una stack en el que se van guardando los operadores
	         		//3. y en el otro puede ser una lista o un string en donde se guarda
	         		
	         		if(caracter.trim().isEmpty()==false)
	         		{
	         			if(caracter.equals("+"))
	         			{
	         				stackOperadores.push(caracter);
	         				
	         				int valorB = stackValores.pop();
	         				int valorA = stackValores.pop();
	         				
	         				stackValores.push(calculadora.sum(valorA, valorB));
	         				
	         				stackOperadores.pop();
	         			}
	         			else if (caracter.equals("-"))
	         			{
	         				stackOperadores.push(caracter);
	         				
	         				int valorB = stackValores.pop();
	         				int valorA = stackValores.pop();
	         				
	         				stackValores.push(calculadora.substraction(valorA, valorB));
	         				stackOperadores.pop();
	         			}
	         			else if (caracter.equals("*"))
	         			{
	         				stackOperadores.push(caracter);
	         				
	         				int valorB = stackValores.pop();
	         				int valorA = stackValores.pop();
	         				
	         				stackValores.push(calculadora.multiply(valorA, valorB));
	         				stackOperadores.pop();
	         			}
	         			else if (caracter.equals("/"))
	         			{
	         				stackOperadores.push(caracter);
	         				
	         				int valorB = stackValores.pop();
	         				int valorA = stackValores.pop();
	         				
	         				stackValores.push(calculadora.division(valorA, valorB));
	         				stackOperadores.pop();
	         			}
	         			else
	         			{
	         				stackValores.push(Integer.parseInt(caracter));
	         			}
	         		}
	         	}
	        	
	        	if(stackValores.size()==1) {
	        		System.out.println("\nResultado: "+stackValores.pop());
	        	}
	         }
	         
	         	
	      }
	      
	      
	      
	      catch(Exception e){
	         e.printStackTrace();
	         
	         
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
		
		
		
		
		
		
	}
}

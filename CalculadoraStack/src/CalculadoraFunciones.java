/**
 * @author Mario de Leon
 * @author Mariana Morales
 *
 */
public class CalculadoraFunciones implements OperacionesInterface{

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		int resultado = a+b;
		return resultado;
	}

	@Override
	public int substraction(int a, int b) {
		// TODO Auto-generated method stub
		int resultado = a-b;
		return resultado;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		int resultado = a*b;
		return resultado;
	}

	@Override
	public int division(int a, int b) {
		// TODO Auto-generated method stub
		int resultado = 0;
		try {
			resultado = a/b;
			
		}catch (Exception e) {
			System.out.println("Operacion invalida.");
			resultado = 999999999;
		}
		return resultado;			
	}		
}

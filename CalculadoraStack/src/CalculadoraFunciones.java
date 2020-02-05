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
		if(b == 0) {
			System.out.print("No se puede dividir entre 0. La operacion se ha cancelado.");
			return 0;
		}else {
			int resultado = a/b;
			return resultado;
		}
	}		
}
/**
 * 
 */

/**
 * @author Usuario Dell
 *
 */
public class CalculadoraFunciones implements OperacionesInterface{

	@Override
	public int sumaEnteros(int a, int b) {
		// TODO Auto-generated method stub
		int resultado = a+b;
		return resultado;
	}

	@Override
	public int restaEnteros(int a, int b) {
		// TODO Auto-generated method stub
		int resultado = a-b;
		return resultado;
	}

	@Override
	public int multiplicacionEnteros(int a, int b) {
		// TODO Auto-generated method stub
		int resultado = a*b;
		return resultado;
	}

	@Override
	public int divisionEnteros(int a, int b) {
		// TODO Auto-generated method stub
		int resultado = a/b;
		return resultado;
	}
	
}

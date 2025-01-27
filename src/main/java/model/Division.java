package model;

public class Division implements Operacion {

	@Override
	public double calcular(double num1, double num2) {
		if(num2 == 0){
			throw new ArithmeticException("No se puede dividir por cero (0).");
		}
		return num1 / num2;
	}
}

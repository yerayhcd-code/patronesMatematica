package controller;

import model.Operacion;

//Patron Singleton
//Durante la ejecución, solo se puede tener una instancia de la clase Calculadora.
public class Calculadora {
	private static Calculadora calculadora;
	
	private Operacion operacion;

	public Calculadora() {
		super();
	}

	public static Calculadora getInstance() {
		if(calculadora == null) {
			calculadora = new Calculadora();
		}
		return calculadora;
	}
	
	public void setOperacion(Operacion operacion) {
		this.operacion = operacion;
	}
	
	public double calcular(double num1, double num2) {
		if(operacion == null) {
			throw new IllegalStateException("No se ha definido el tipo de operación a realizar.");
		}
		return operacion.calcular(num1, num2);
	}
}

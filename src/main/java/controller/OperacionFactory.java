package controller;

import model.Division;
import model.Multiplicacion;
import model.Operacion;
import model.Resta;
import model.Suma;

//Patron Factory Method
//La clase OperacionFactory se encarga de crear las operaciones según un código de operación.

public class OperacionFactory {
	public static Operacion crearOperacion(String operacion) {
		switch(operacion) {
			case "+":
				return new Suma();
			case "-":
				return new Resta();
			case "*":
				return new Multiplicacion();
			case "/":
				return new Division();
			default:
				throw new IllegalArgumentException("Operación no válida");
		}
	}
}

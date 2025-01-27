package model;

//Patron Strategy
//La interfaz Operacion define el contrato que deben cumplir las operaciones.

public interface Operacion {
	double calcular(double num1, double num2);
}

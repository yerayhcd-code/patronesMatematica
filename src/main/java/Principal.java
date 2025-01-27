import java.text.DecimalFormat;
import java.util.Scanner;

import controller.Calculadora;
import controller.OperacionFactory;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculadora calculadora = Calculadora.getInstance();
		DecimalFormat decimalFormat = new DecimalFormat("0.######");
		boolean continuar = true;
		
		while (continuar) {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Suma (+)");
            System.out.println("2. Resta (-)");
            System.out.println("3. Multiplicación (*)");
            System.out.println("4. División (/)");
            System.out.print("Opción: ");
            String opcion = scanner.nextLine();

            String operacion;
            switch (opcion) {
                case "1":
                    operacion = "+";
                    break;
                case "2":
                    operacion = "-";
                    break;
                case "3":
                    operacion = "*";
                    break;
                case "4":
                    operacion = "/";
                    break;
                default:
                    operacion = null;
                    break;
            }

            if (operacion == null) {
                System.out.println("Opción inválida. Intente de nuevo.");
                continue;
            }

            System.out.print("Ingrese el primer número: ");
            double numero1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Ingrese el segundo número: ");
            double numero2 = Double.parseDouble(scanner.nextLine());

            try {
                calculadora.setOperacion(OperacionFactory.crearOperacion(operacion));
                double resultado = calculadora.calcular(numero1, numero2);
                System.out.println("Resultado: " + decimalFormat.format(resultado));
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.print("¿Desea realizar otra operación? (s/n): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }
		
		scanner.close();
	}
}

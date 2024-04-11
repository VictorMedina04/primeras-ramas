package calculadora;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String aux;
		int op;
		double a, b;
		Calculadora calculadora = new Calculadora();
		do {
			System.out.println("""
					0-Salir
					1-Suma
					2-Resta
					3-Multiplicar
					4-Dividir
					""");
			aux = sc.nextLine();
			op = Integer.parseInt(aux);
			switch (op) {
			case 1:

				System.out.println("Dime dos numeros");
				aux = sc.nextLine();
				a = Double.parseDouble(aux);
				b = Double.parseDouble(aux);

				calculadora.suma(a, b);

				break;

			case 2:

				System.out.println("Dime dos numeros");
				aux = sc.nextLine();
				a = Double.parseDouble(aux);
				b = Double.parseDouble(aux);

				calculadora.resta(a, b);

				break;
			case 3:

				System.out.println("Dime dos numeros");
				aux = sc.nextLine();
				a = Double.parseDouble(aux);
				b = Double.parseDouble(aux);

				calculadora.multiplicacion(a, b);

				break;
			case 4:

				System.out.println("Dime dos numeros");
				aux = sc.nextLine();
				a = Double.parseDouble(aux);
				b = Double.parseDouble(aux);

				calculadora.division(a, b);

				break;
			}

		} while (op != 0);
	}

}

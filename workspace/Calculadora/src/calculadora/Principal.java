package calculadora;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String aux;
		int op;
		
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
			
		}while(op!=0);
	}

}

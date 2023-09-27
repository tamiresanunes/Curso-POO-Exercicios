package Condicionalseis;

import java.util.Scanner;

public class Intervalo {
	public void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um número");
		double numero = entrada.nextDouble();

		if (numero < 0.0 || numero > 100.0) {
			System.out.println("Fora de intervalo");
		} else if (numero <= 25.0) {
			System.out.println("Intervalo [0,25]");
		} else if (numero <= 50.0) {
			System.out.println("Intervalo (25,50]");
		} else if (numero <= 75.0) {
			System.out.println("Intervalo (50,75]");
		} else {
			System.out.println("Intervalo (75,100]");
		}

		entrada.close();
	}
}

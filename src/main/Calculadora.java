package main;

import java.util.Scanner;

public class Calculadora {
	public static void calculadora(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un valor");
		double v1 = sc.nextDouble();
		
		System.out.println("operacion a realizar(+, -, *, /.)");
		char o = sc.next().charAt(0);
		
		System.out.println("Introduce otro valor");
		double v2 = sc.nextDouble();

	}
}

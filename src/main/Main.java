package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println();

        // Solicitar nombre y edad
        System.out.print("Introduce tu nombre: ");
        String nombre = s.nextLine();
        System.out.print("Introduce tu edad: ");
        int edad = s.nextInt();

        // Validar que la persona es mayor de edad
        if (edad >= 18) {
            int edadJubilacion = 65;
            if (edad < edadJubilacion) {
                int anosRestantes = edadJubilacion - edad;
                System.out.println(nombre + ", te quedan " + anosRestantes + " años para jubilarte.");
            } else {
                int anosJubilado = edad - edadJubilacion;
                System.out.println(nombre + ", llevas " + anosJubilado + " años jubilado.");
            }
        } else {
            System.out.println("Debes ser mayor de edad para usar este programa.");
        }

        s.close();
    }
}

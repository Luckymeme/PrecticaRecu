package main;
//
//import java.util.Scanner;
//
//public class ej2 {
//	public static void act2(String[] args) {
//	Scanner s = new Scanner(System.in);
//	System.out.println();
//	
//
//    // Solicitar nom y precio del producto
//    System.out.print("Introduce nombre del producto: ");
//    String nom = s.nextLine();
//    System.out.print("Introduce su precio: ");
//    int precio = s.nextInt();
//    System.out.println("¿Añadir mas productos?");
//    int bucle = s.nextInt(1);
//    
//    if (bucle = 1) {
//    	System.out.print("Introduce nombre del producto: ");
//        String nom = s.nextLine();
//        System.out.print("Introduce su precio: ");
//        int precio = s.nextInt();
//    }
//	
//	}
//}
import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreProducto;
        double precioProducto;
        double totalCompra = 0;
        int cantidadProductos = 0;
        String respuesta;

        do {
            // Pedir nombre y precio del producto
            System.out.print("Introduce el nombre del producto: ");
            nombreProducto = scanner.nextLine();
            System.out.print("Introduce el precio del producto: ");
            precioProducto = scanner.nextDouble();
            scanner.nextLine(); // Consumir la nueva línea

            // Sumar el precio al total y aumentar la cantidad de productos
            totalCompra += precioProducto;
            cantidadProductos++;

            // Preguntar si se desea continuar
            System.out.print("¿Deseas introducir otro producto? (SI/NO): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("SI"));

        // Mostrar el importe total y la cantidad de productos
        System.out.println("El importe total de la compra es: " + totalCompra);
        System.out.println("La cantidad de productos comprados es: " + cantidadProductos);

        scanner.close();
    }
}

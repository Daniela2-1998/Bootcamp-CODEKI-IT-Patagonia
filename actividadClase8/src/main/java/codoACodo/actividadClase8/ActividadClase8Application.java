package codoACodo.actividadClase8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

@SpringBootApplication
public class ActividadClase8Application {

	public static void main(String[] args) {
		SpringApplication.run(ActividadClase8Application.class, args);

		Scanner scanner = new Scanner(System.in);

		// ACTIVIDAD 1 Y 2
		ArrayList<String> razas = new ArrayList<>();
		String eleccion = "continuar";
		do{
			System.out.println("Ingrese una raza al sistema:");
			razas.add(scanner.nextLine());
			System.out.println("¿Desea continuar o desea salir?");
			eleccion = scanner.nextLine();

		} while (eleccion.equalsIgnoreCase("continuar"));

		if(eleccion.equalsIgnoreCase("salir")){
			System.out.println(razas);
			System.out.println("Elija una raza para eliminarla:");
			String razaElegida = scanner.nextLine();

			for (int i = 0; i < razas.size(); i++) {
				if (razas.get(i).equalsIgnoreCase(razaElegida)){
					System.out.println("Se eliminará la raza " + razaElegida);
					razas.remove(i);
				} else {
					System.out.println("No se encontró la raza");
				}
			}
			System.out.println(razas);
			System.out.println("Saliendo del programa...");
		}
	

	    // ACTIVIDAD 3
		HashMap<String, Double> productos = new HashMap<String, Double>();
		String acciones = "";
		String alternativa = "elegir";

		do {
			System.out.println("¿Desea elegir o salir?");
			alternativa = scanner.nextLine();
			System.out.println("Elije una opción: ingresar, modificar, eliminar o visualizar");
			acciones = scanner.nextLine();


			switch (acciones) {
				case "ingresar":
					System.out.println("Ingrese el nombre del producto:");
					String nombre = scanner.nextLine();
					System.out.println("Ingrese el precio del producto:");
					Double precio = scanner.nextDouble();
					productos.put(nombre, precio);
					break;
				case "modificar":
					System.out.println("¿Qué producto quieres modificar?");
					String busqueda = scanner.nextLine();
					System.out.println(productos.get(busqueda));
					System.out.println("Ingresa el nuevo precio:");
					Double nuevoPrecio = scanner.nextDouble();
					productos.replace(busqueda, nuevoPrecio);
					break;
				case "eliminar":
					System.out.println("¿Qué producto quieres eliminar?");
					String aEliminar = scanner.nextLine();
					productos.remove(aEliminar);
					break;
				case "lista":
					System.out.println(productos);
					break;
				default:
					System.out.println("La lista completa de productos es: ");
					System.out.println(productos);
			}
		} while (alternativa.equalsIgnoreCase("elegir"));

	}
}

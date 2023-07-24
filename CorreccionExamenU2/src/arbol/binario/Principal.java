package arbol.binario;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArbolBinario arbol = new ArbolBinario();
		int opcion;
		
		do {
			System.out.println("\n*** Menú de operaciones del Árbol Binario***");
			System.out.println("1. Insertar un nodo");
			System.out.println("2. Recorrido en Preorden");
			System.out.println("3. Insertar un Inorden");
			System.out.println("4. Insertar un Postorden");
			System.out.println("5. Número de nodos");
			System.out.println("6. Suma de valores de nodos");
			System.out.println("7. Salir");
			System.out.println("Ingrese la opción deseada: ");
			opcion = scanner.nextInt();

			switch (opcion) {
			case 1 -> {
				System.out.print("Ingrese el valor del nodo a insertar: ");
				arbol.insertar(scanner.nextInt());
			}
			case 2 -> {
				System.out.println("Recorrido en Preorden");
				arbol.imprimirPreorden(arbol.getRaiz());
				System.out.println();
			}

			case 3 -> {
				System.out.println("Recorrido en Inorden");
				arbol.imprimirEnOrden(arbol.getRaiz());
				System.out.println();
			}
			case 4 -> {
				System.out.println("Recorrido en Postorden");
				arbol.imprimirPostorden(arbol.getRaiz());
				System.out.println();
			}
			case 5 -> System.out.println("Número de nodos en el árbol: " + arbol.contarNodos());
			case 6 -> System.out.println("Suma de valores de nodos del árbol: " + arbol.sumarElementos());
			case 7 -> System.out.println("Saliendo del programa");
			default -> System.out.println("pcíon inválida. Intente nuevamente");

			}
		} while (opcion != 7);

		scanner.close();
	}

}

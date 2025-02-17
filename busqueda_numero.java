package MatrixAPP;
import java.util.Random;
import java.util.Scanner;

public class busqueda_numero {

	public class MatrixApp {
	    public static void main(String[] args) {
	        // Crear la matriz de 5x5 con números aleatorios entre 1 y 100
	        int[][] matrix = new int[5][5];
	        Random rand = new Random();

	        // Llenar la matriz con números aleatorios
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                matrix[i][j] = rand.nextInt(100) + 1;  // Números entre 1 y 100
	            }
	        }

	        // Mostrar la matriz en consola
	        System.out.println("Matriz generada:");
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }

	        // Permitir al usuario buscar un número en la matriz
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce el número que deseas buscar: ");
	        int numeroBuscado = scanner.nextInt();

	        // Búsqueda del número en la matriz
	        boolean encontrado = false;
	        for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                if (matrix[i][j] == numeroBuscado) {
	                    System.out.println("El número " + numeroBuscado + " se encuentra en la posición (" + i + ", " + j + ").");
	                    encontrado = true;
	                    break;
	                }
	            }
	            if (encontrado) break;
	        }

	        if (!encontrado) {
	            System.out.println("El número no se encuentra en la matriz.");
	        }
	    }
	}
}

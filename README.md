package MatrixAPP;

import java.util.Random;

public class c2 {
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
    }
}

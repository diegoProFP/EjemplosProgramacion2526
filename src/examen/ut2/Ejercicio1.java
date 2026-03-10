package examen.ut2;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicio 1:
 Realiza un programa que genere un cuadrado 3×3 con números aleatorios del 1 al 9, sin repetición.
 Debe mostrarse como si fuera una mini-casilla de sudoku. La impresión por pantalla será exactamente así:
 Posteriormente, se pedirá al usuario un número entre el 1 y el 9, y el programa deberá indicar si el número
 está presente o no en la matriz, mostrando la coordenada exacta en formato fila/columna (empezando por
 1).
 El formato de mensajes será exactamente así:
 *** MINI SUDOKU ALEATORIO ***
 Tu cuadrado es:
 2 9 4
 7 1 5
 3 6 8
 Introduce un número a buscar (1-9):
 5
 El número 5 SÍ está en el cuadrado (fila 2, columna 3).
 */
public class Ejercicio1 {
	public static void main(String[] args) {
		System.out.println("***  MINI SUDOKU ALEATORIO ***");
		System.out.println("Tu cuadrado es:");

		int[][] sudoku = new int[3][3]; // Matriz de 3 filas por 3 columnas
		int maximoNumeros = sudoku.length * sudoku[0].length;
		int[] numerosGenerados = new int[maximoNumeros]; // Array para evitar números repetidos
		int totalNumeros = 0;

		Random aleatorio = new Random();
		while (totalNumeros < maximoNumeros) {
			int numeroAleatorio = aleatorio.nextInt(1,10);

			// Verificar si el número ya está en el array
			boolean repetido = false;
			int cont = 0;
			while (cont < totalNumeros && !repetido) {
				if (numerosGenerados[cont] == numeroAleatorio) {
					repetido = true;
				}
				cont++;
			}

			// Si no está repetido, agregarlo al array
			if (!repetido) {
				numerosGenerados[totalNumeros] = numeroAleatorio;
				totalNumeros++;
			}
		}

		// Llenar la matriz con los números generados
		int indice = 0;
		for (int fila = 0; fila < sudoku.length; fila++) {
			for (int columna = 0; columna < sudoku[0].length; columna++) {
				sudoku[fila][columna] = numerosGenerados[indice];
				indice++;
			}
		}

		// Imprimir en pantalla
		for (int fila = 0; fila < sudoku.length; fila++) {
			for (int columna = 0; columna < sudoku[0].length; columna++) {
				System.out.print(sudoku[fila][columna] + " ");
			}
			System.out.println();
		}

		Scanner teclado = new Scanner(System.in);
		int numeroABuscar =-1;
		do{
			System.out.println("Introduce un número a buscar (1-9):");
			numeroABuscar =teclado.nextInt();
		}while (numeroABuscar<1 || numeroABuscar>9);

		boolean encontrado = false;
		int filaBuscada = -1;
		int columnaBuscada = -1;
			for (int fila = 0; fila < sudoku.length; fila++) {
				for (int columna = 0; columna < sudoku[0].length; columna++) {
					if(sudoku[fila][columna]==numeroABuscar){
						encontrado=true;
						filaBuscada=fila+1;
						columnaBuscada=columna+1;
					}
				}
			}
		if(encontrado){
			System.out.println("El número " + numeroABuscar + " SÍ está en el cuadrado (fila "+ filaBuscada +", columna "+ columnaBuscada + ")..");
		}


	}
}

package bucles.ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio22Cristina {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(
                System.in
        );
        System.out.println("Introduce un número para ver su pirámide");
        int totalFilas = teclado.nextInt();
        for (int numFila = 0; numFila < totalFilas; numFila++) {
            int espaciosMax = totalFilas - numFila;
            for (int contEspacios = 0; contEspacios <= espaciosMax; contEspacios++) {
                System.out.print(" ");
            }
            int numAsteriscosFila = numFila * 2;
            for (int contAsteriscos = 0; contAsteriscos <= numAsteriscosFila; contAsteriscos++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

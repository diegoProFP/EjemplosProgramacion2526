package bucles.ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero:");

        int numeroUsuario = teclado.nextInt();
        for (int fila = 1; fila <= numeroUsuario; fila++) {
            for (int columna = 1; columna <= fila; columna++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

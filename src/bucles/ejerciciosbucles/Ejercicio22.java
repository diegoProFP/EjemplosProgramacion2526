package bucles.ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime el número de filas y te hago la pirámide");
        int numFilas = teclado.nextInt();
        int numAsteriscos = 1;
        int espaciosMax = numFilas - 1;

        for (int fila = 0; fila < numFilas; fila++) {

            for(int contEspacios = 1; contEspacios <= espaciosMax; contEspacios++){
                System.out.print(" ");
            }
            for(int contAsterisco = 1; contAsterisco <= numAsteriscos; contAsterisco++){
                System.out.print("*");
            }
            espaciosMax--;
            numAsteriscos+=2;
            System.out.println();

        }



    }
}

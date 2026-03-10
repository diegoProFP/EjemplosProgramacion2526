package bucles;

import java.util.Random;
import java.util.Scanner;

public class EjemploFor {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        int numAleatorio= aleatorio.nextInt(0,10);

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántas veces quieres ver el nombre de Paco?");
        int numero = teclado.nextInt();
        for (int cont = 1; cont <= numero; cont++) {
            System.out.println("PACO. Llevo " + cont + " vez/veces");

        }

    }
}

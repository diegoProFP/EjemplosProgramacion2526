package arrays.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/*
Crea un programa que permita al usuario almacenar una secuencia
aritmética en un array y luego mostrarla. Una secuencia aritmética es una
serie de números que comienza por un valor inicial V, y continúa con
incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería 1, 3, 5, 7,
9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El programa
solicitará al usuario V, I además de N (nº de valores a crear).
 */
public class Ejercicios13 {

    public static void main(String[] args) {
        System.out.println("Dime cuántos nºos ponemos:");
        Scanner teclado = new Scanner(System.in);
        int totalNumeros = teclado.nextInt();
        System.out.println("Dime con qué valor empezamos:");
        int valorInicial = teclado.nextInt();
        System.out.println("Dime con qué incremento hacemos la secuencia:");
        int incremento = teclado.nextInt();

        int[] secuencia = new int[totalNumeros];
        int siguienteNumero = 0;

        for (int cont = 0; cont < secuencia.length; cont++) {
            siguienteNumero = valorInicial + (incremento * cont);
            secuencia[cont] = siguienteNumero;
        }
        System.out.println("La secuencia es: ");
        System.out.println(Arrays.toString(secuencia));
    }
}

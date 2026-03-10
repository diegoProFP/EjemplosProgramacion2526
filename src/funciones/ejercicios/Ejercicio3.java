package funciones.ejercicios;

import java.util.Scanner;

/*
Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cual es el
mínimo. Implementa y utiliza la función:
int minimo(int a, int b) // Devuelve el menor entre a y b
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int[] numeros = new int[2];

        //we declare the keyboard input variable
        Scanner sc = new Scanner(
                System.in
        );

        for (int cont = 0; cont < numeros.length; cont++) {
            System.out.println("Dime el número " + (cont + 1) + ": ");
            int numUsuario = sc.nextInt();
            numeros[cont] = numUsuario;
        }

        int numeroMenor = minimo(numeros[0], numeros[1]);
        System.out.println("El número menor es: " + numeroMenor);
    }

    public static int minimo(int num1, int num2) {
        return Math.min(num1, num2);
    }
}

package arrays.ejercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Crea un programa que pida diez números reales por teclado, los almacene
en un array, y luego lo recorra para averiguar el máximo y mínimo y
mostrarlos por pantalla
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        final int MAXIMO_NUMEROS = 10;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime 10 numeros y hacemos magia");
        double maximo = 0;
        double minimo = 0;
        double[] numeros = new double[MAXIMO_NUMEROS];
        for (int cont = 0; cont < MAXIMO_NUMEROS; cont++) {
            System.out.println("Numero " + (cont+1) + ", por favor...");
            numeros[cont] = teclado.nextDouble();
        }

        //Por defecto, consideramos el menor, el primer numero
        minimo = numeros[0];
        for (int cont = 0; cont < numeros.length; cont++) {
            double numeroUsuario = numeros[cont];
            if(numeroUsuario > maximo){
                maximo = numeroUsuario;
            }
            if(numeroUsuario < minimo){
                minimo = numeroUsuario;
            }
        }

        System.out.println("El valor máximo es: " + maximo);
        System.out.println("El valor mínimo es: " + minimo);

    }
}

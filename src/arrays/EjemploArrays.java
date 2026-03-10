package arrays;

import java.util.Scanner;

public class EjemploArrays {
    public static void main(String[] args) {

        double[] notas = new double[6];
        notas[0] = 6.1;//escribiendo un valor en la posicion 0
        notas[1] = 2.3;
        System.out.println("Notas: " + notas);
        double valorPrimeraNota = notas[0];//accediendo al valor en pos 0
        System.out.println("valorPrimeraNota = " + valorPrimeraNota);
        System.out.println("Nota de posicion 0: " + notas[0]);
        System.out.println("Nota de posicion 1: " + notas[1]);
        System.out.println("Nota de posicion 2: " + notas[2]);

        //Crea un array de enteros con las edades de tus 3 mejores amigos
        //Mete los valores, y luego accede a cada uno de ellos mostrándolos por pantalla
        //Coge la edad del primer elemento, y multiplicalo por 7
        int[] edades = new int[3];
        edades[0] = 29;
        edades[1] = 31;
        edades[2] = 32;

        System.out.println("Edades de mis amigos");
        System.out.println("Primer amigo: " + edades[0]);
        System.out.println("Segundo amigo: " + edades[1]);
        System.out.println("Tercer amigo: " + edades[2]);

        //Crea un array de Strings, con los nombres de tus mejores amigos
        //Mete los valores, y luego accede a cada uno de ellos mostrándolos por pantalla
        String[] nombres = new String[3];
        nombres[0] = "Jose";



    }
}

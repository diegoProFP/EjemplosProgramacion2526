package arrays;

import java.util.Random;
import java.util.Scanner;

public class EjemploArrays2Sheila {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(
                System.in
        );
        System.out.println("¿Con cuántos alumnos trabajamos? Dime el nº y te genero notas aleatorias");
        int numAlumnos = teclado.nextInt();
        int[] notasAlumnos = new int[numAlumnos];

        //Preguntar al array su capacidad (tamaño)
        int capacidad = notasAlumnos.length;
        System.out.println("El array tiene esta capacidad: " + capacidad);
        Random generadorAleatorios = new Random();//crea el generador de aleatoriedad
        int TotalNotas = 0;
        double mediaNotas = 0;

        for (int cont = 0; cont < notasAlumnos.length; cont++) {
//            generadorAleatorios.nextInt(0, 10);
            int numAleatorio = generadorAleatorios.nextInt(0,11);//le pedimos un entero aleatorio
            notasAlumnos[cont] = numAleatorio;
            System.out.println("Estas son las notas: " + numAleatorio);

            if (numAleatorio == 10){
                numAlumnos = numAlumnos - cont;
                cont = numAlumnos + cont;
            }

            TotalNotas = TotalNotas + numAleatorio;
            mediaNotas = (float)TotalNotas / numAlumnos;
        }
        System.out.println("La media de todas las notas es: " + mediaNotas);
    }
}

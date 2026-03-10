package arrays;

import java.util.Random;
import java.util.Scanner;

public class EjemploArrays2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Con cuántos alumnos trabajamos? Dime el nº y te genero notas aleatorias");
        int numAlumnos = teclado.nextInt();
        int[] notasAlumnos = new int[numAlumnos];

        //Preguntar al array su capacidad (tamaño)
        int capacidad = notasAlumnos.length;
        System.out.println("El array tiene esta capacidad: " + capacidad);
        Random generadorAleatorios = new Random();//crea el generador de aleatoriedad

        for(int cont = 0; cont < notasAlumnos.length; cont++){
            int numAleatorio = generadorAleatorios.nextInt(0, 11);//le pedimos un entero aleatorio
            notasAlumnos[cont] = numAleatorio;
        }
        //1º: Recorrer el array mostrando todos los valores. Uno en cada línea

        //Se recorren todas las notas de alumnos y se muestran
        for (int cont = 0; cont < notasAlumnos.length; cont++) {
            System.out.println("Nota del alumno " + (cont+1) + ": " + notasAlumnos[cont]);
        }

        //2º Recorrer el array (en otro bucle distinto) y queremos hacer LA MEDIA de las notas
        int sumaNotas = 0;

        for (int cont = 0; cont < notasAlumnos.length; cont+=2) {
            //Se coge la nota del alumno en posicion cont
            int notaDelAlumno = notasAlumnos[cont];
            sumaNotas = sumaNotas + notaDelAlumno;
        }
        System.out.println("sumaNotas = " + sumaNotas);

        //Casting de tipos: forzamos a la variable a que
        //se convierta a otro tipo
        float mediaNotas = (float)sumaNotas / notasAlumnos.length;
        System.out.println("mediaNotas = " + mediaNotas);

        //3º Recorrer el array hasta que encontremos una nota que sea igual a 10
        //(si la nota es igual a 10, el bucle deberia detenerse)NO USAR BREAK
        int contador = 0;
        boolean hayNota10 = false;

        while(contador < notasAlumnos.length && !hayNota10){
            int notaAlumno = notasAlumnos[contador];
            if(notaAlumno == 10){
                hayNota10 = true;
            }else{
                contador++;
            }
        }

        if(hayNota10){
            System.out.println("Sí que hay alguna nota igual a 10. La tiene el alumno en posición " + (contador+1));
        }else{
            System.out.println("NO hay alguna nota igual a 10");

        }

    }
}

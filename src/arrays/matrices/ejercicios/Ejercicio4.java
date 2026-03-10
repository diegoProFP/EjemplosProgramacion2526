package arrays.matrices.ejercicios;

import java.util.Random;

/*
Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
programa mostrará la nota mínima, máxima y media de cada alumno
 */
public class Ejercicio4 {
    public static void main(String[] args) {

        double[][] notasAlumnos = new double[4][5];
        Random aleatorio = new Random();
        for (int contFila = 0; contFila < notasAlumnos.length; contFila++) {
            for (int contCol = 0; contCol < notasAlumnos[0].length; contCol++) {
                //Donde tengo que generar la nota aleatoria y meterla en la celda
                notasAlumnos[contFila][contCol] = aleatorio.nextDouble(0,10);
                System.out.print(notasAlumnos[contFila][contCol] + " ");
            }
            System.out.println();
        }
        for (int contFila = 0; contFila < notasAlumnos.length; contFila++) {
            System.out.println();
            System.out.println("----------------------------");
            System.out.println(String.format("Alumno núm %d:", (contFila+1)));
            double notaMax = 0;
            double notaMin = Double.MAX_VALUE;
            double mediaNotas = 0;
            double sumaNotas = 0;
            for (int contCol = 0; contCol < notasAlumnos[0].length; contCol++) {
                double notaAlumno = notasAlumnos[contFila][contCol];
                notaMax = Math.max(notaMax, notaAlumno);
                notaMin = Math.min(notaMin, notaAlumno);
                sumaNotas += notaAlumno;
            }
            mediaNotas = sumaNotas / notasAlumnos[0].length;
            System.out.println("Maxima nota: " + notaMax);
            System.out.println("Minima nota: " + notaMin);
            System.out.println("Media notas: " + mediaNotas);
        }

    }
}

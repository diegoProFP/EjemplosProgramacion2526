package examen.ut2;

import java.util.Scanner;

/**
 Solicita por teclado un tamaño de almacenamiento digital en GIGABYTES (debe ser un valor decimal
 positivo) y una unidad final a la que convertir. Las opciones de unidad final son: KB, MB y TB.
 Controla los errores que podrían ocurrir al introducir la información necesaria para resolver el problema
 (valores negativos, texto en lugar de número, unidad no válida, etc.).
 Actualmente, las equivalencias que se usarán en el programa son:
 • 1 GB = 1 024 MB
 • 1 GB = 1 024 × 1 024 KB
 • 1 GB = 1 / 1 024 TB
 Realiza un programa que recoja los datos necesarios y realice la conversión de almacenamiento al usuario.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double tamanyo;
        String unidad;

        System.out.println("***  BIENVENIDO AL SISTEMA DE CONVERSION DE ALMACENAMIENTO ***");
        do {
            System.out.print("Introduzca tamaño en GB: ");
            while (!teclado.hasNextDouble()) {
                System.out.println("Debe introducir un número válido.");
                teclado.next(); // Limpiar buffer
            }
            tamanyo = teclado.nextDouble();
        } while (tamanyo <= 0);

        System.out.print("Introduzca unidad final (KB / MB / TB): ");
        unidad = teclado.nextLine().toUpperCase();

        double resultado = -1;
        switch (unidad) {
            case "KB":
                resultado = tamanyo * 1_024 * 1_024;
                break;
            case "MB":
                resultado = tamanyo * 1_024;
                break;
            case "TB":
                resultado = tamanyo / 1_024;
                break;
            default:
            	System.out.println("No existe esa unidad de conversión");
        }

        if(resultado != -1) {
            System.out.println("**** RESULTADO ****");
        	System.out.println("EL TAMAÑO DE " + tamanyo + " GB EN " + unidad + " ES " +  resultado);
        }
        
        teclado.close();
    }
}

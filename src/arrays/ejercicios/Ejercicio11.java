package arrays.ejercicios;

import java.util.Arrays;

/*
Crea un programa que cree dos arrays de enteros de tamaño 100.
Luego introducirá en el primer array todos los valores del 1 al 100. Por
último, deberá copiar todos los valores del primer array al segundo array
en orden inverso, y mostrar ambos por pantalla
 */
public class Ejercicio11 {
    public static void main(String[] args) {

        int[] array1 = new int[100];
        int[] array2 = new int[100];
        for (int cont = 0; cont < array1.length; cont++) {
            array1[cont] = (cont+1);
        }


        int contadorArray1 = array1.length-1;

        for (int contArray2 = 0; contArray2 < array2.length; contArray2++) {
            array2[contArray2] = array1[contadorArray1];
            contadorArray1--;
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));



    }
}

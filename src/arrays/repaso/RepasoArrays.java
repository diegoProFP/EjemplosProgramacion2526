package arrays.repaso;

import java.util.Arrays;
import java.util.Scanner;

public class RepasoArrays {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime cuántos nombres cogemos");
        int numElementos = teclado.nextInt();
        teclado.nextLine();

        String[] nombres = new String[numElementos];

        int numero = 5;

        for (int cont = 0; cont < nombres.length; cont++) {
            System.out.println("Dime un nombre: ");
            String palabra = teclado.nextLine();
            nombres[cont] = palabra;
        }

        System.out.println(Arrays.toString(nombres));

        System.out.println("Dime una posicion y te digo el nombre que hay ahí");
        int posicion = teclado.nextInt();

        System.out.println("El nombre es: " + nombres[posicion]);

        System.out.println("Ok, ahora voy a mostrar la inicial de cada nombre");
        //Recorrer el array para coger individualmente cada nombre
        mostrarIniciales(nombres);

    }
    public static void mostrarIniciales(String[] cadenas){
        for (int cont = 0; cont < cadenas.length; cont++) {
            String nombreEnArray = cadenas[cont];
            //Coger la inicial del nombre
            System.out.println("Inicial: " + obtenerInicial(nombreEnArray));
        }
    }
    public static char obtenerInicial(String cadena){

        if(cadena !=null && !cadena.isEmpty()){
            return cadena.charAt(0);
        }else{
            return '?';
        }
    }
}

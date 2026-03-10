package arrays.ejercicios;

import java.util.Scanner;

public class EjercicioArrayYStringPablo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(
                System.in
        );
        System.out.println("Dime una frase y te la separo por palabras");
        String fraseUsuario = teclado.nextLine();

        int contadorPalabras = 1;

        for (int cont = 0; cont < fraseUsuario.length(); cont++) {
            if (fraseUsuario.charAt(cont) == ' ') {
                contadorPalabras++;
            }
        }

        String[] contPalabras= new String[contadorPalabras];
        String palabra = "";
        int indice = 0;

        for (int contFinal = 0; contFinal < fraseUsuario.length(); contFinal++) {
            char letra = fraseUsuario.charAt(contFinal);
            if (letra != ' ') {
                palabra += letra;
            } else {
                contPalabras[indice] = palabra;
                palabra = "";
                indice++;
            }
        }


        contPalabras[indice] = palabra;

        for (int contFinal = 0; contFinal < contPalabras.length; contFinal++) {
            System.out.println(contFinal + " -> " + contPalabras[contFinal]);
        }
    }
}

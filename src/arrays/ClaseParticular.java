package arrays;

import java.util.Scanner;

public class ClaseParticular {
    public static void main(String[] args) {

        String[] nombres;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos nombres quieres guardar?");
        int numero = teclado.nextInt();
        teclado.nextLine();

        nombres = new String[numero];

        System.out.println("Ok, he creado un array de " + numero + " posiciones");


    }
}

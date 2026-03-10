package bucles.ejerciciosbucles;

import java.util.Scanner;

/*
Realiza un programa en java que pida un número entero positivo y nos diga
si es primo o no.
 */
public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número entero positivo y te digo si es primo o no");
        int numero = teclado.nextInt();

        if(numero >= 0){

        }else{
            System.out.println("No has seguido las instrucciones...");
        }
    }
}

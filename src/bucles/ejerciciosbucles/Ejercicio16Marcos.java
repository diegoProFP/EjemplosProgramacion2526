package bucles.ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio16Marcos {

    public static void main(String[] args) {
        //we declare the keyboard input variable
        Scanner sc = new Scanner(
                System.in
        );

        System.out.println("Dime un número");
        int numero = sc.nextInt();

        boolean esPrimo = true;
        int divisor = 2;
        while(divisor < numero && esPrimo){
            if (numero % divisor == 0) {
                esPrimo = false;
            }
            divisor++;
        }

        if (esPrimo) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }
    }
}

package bucles;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class EjemploWhile {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número y te digo los numeros que hay del 1 a ese");
        int numero = teclado.nextInt();
        int contador = 0;
        boolean hayMultiplo7 = false;
        while (contador < numero && hayMultiplo7 == false){
            contador++;
            if(contador % 7 == 0){
                hayMultiplo7 = true;
            }
            System.out.println("Número: " + contador);
        }


    }
}

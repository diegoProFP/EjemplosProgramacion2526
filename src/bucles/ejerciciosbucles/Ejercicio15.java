package bucles.ejerciciosbucles;

import java.util.Scanner;

/*
Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un
número que introducimos por teclado
 */
public class Ejercicio15 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un número y te CUENTO los múltiplos de 3 que hay hasta ese número");
        int numero = teclado.nextInt();
        int totalMultiplos3 = 0;
        for (int cont = 1; cont <= numero; cont++) {
            if(cont % 3 == 0){
                totalMultiplos3++;
            }
        }
        System.out.println("El nº de múltiplos es: " + totalMultiplos3);
    }
}

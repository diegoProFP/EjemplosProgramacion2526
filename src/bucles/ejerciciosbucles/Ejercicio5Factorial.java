package bucles.ejerciciosbucles;

import java.util.Scanner;

public class Ejercicio5Factorial {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un numero y te hago el factorial");
        int numero = teclado.nextInt();

        System.out.print(numero + "!=");

        int resFactorial = 1;
        for (int contador = numero; contador >= 1; contador--) {

            resFactorial = resFactorial * contador;
            if(contador != 1){
                System.out.print(contador + "·");
            }else{
                System.out.print(contador);
            }
        }
        //ejemplo de cómo podemos hacer tabulaciones, saltos de linea, y caracters especiales en un string
        System.out.println("\n \t \"Resultado\": " + resFactorial);

    }
}









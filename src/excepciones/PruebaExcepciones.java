package excepciones;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaExcepciones {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu edad, por favor");
        try{
            int edad = teclado.nextInt();
            teclado.nextDouble();
            System.out.println("Tu edad es: "  + edad);

            int[] array = new int[2];
            array[5] = 999;//PROVOCO LA EXCEPCION

        }catch (InputMismatchException excepcion){

            System.out.println("Hay que decir exactamente el número de tu edad. Bruto!");
        }catch (IllegalStateException e){
            System.out.println("Parece que se ha cerrado el scanner... Más info: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Se ha producido una excepcion generica: ");
        }

        System.out.println("Adios!!!!!");


    }
}

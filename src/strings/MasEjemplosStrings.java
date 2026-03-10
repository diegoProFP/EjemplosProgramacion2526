package strings;

import java.util.Scanner;


public class MasEjemplosStrings {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu email:");
        String email = teclado.nextLine();
        
        //Cómo haría para sacar el dominio raíz (por ej .org)?
        int posicionUltimoPunto =email.lastIndexOf(".");
        String dominioRaiz = email.substring(posicionUltimoPunto);
        System.out.println("dominioRaiz = " + dominioRaiz);

        if(email.indexOf("educa.madrid") != -1){
            System.out.println("El email es de educaMadrid");
        }else{
            System.out.println("No es de educaMadrid");
        }


        /*
        Idea para un ejercicio:
        Tenemos un array de emails (array de Strings)
        Tenemos que contar la media de vocales que existen en esos emails
        SÓLO VAMOS A CONTEMPLAR EL NOMBRE DE USUARIO de esos email.Ignoramos el dominio de correo

        bonus: Cómo podríamos hacer un nuevo array donde estén ordenados los emails POR LONGITUD
         */

    }
}

package funciones.ejercicios;

import java.util.Scanner;

/*
Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad
o no. Implementa y utiliza la función:
boolean esMayorEdad(int edad) // Devuelve verdadero si edad>=18, falso en caso contrario
 */
public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Qué edad tienes? Te diré si eres yogurín o no");
        int edadUsuario = teclado.nextInt();

//        System.out.println(esMayorEdad(edadUsuario));
        if(esMayorEdad(edadUsuario)){
            System.out.println("Enhorabuena, a currar");
        }else{
            System.out.println("Te queda un poco más...");
        }
    }

    public static boolean esMayorEdad(int edad){
        return edad >= 18;
//        if(edad >= 18){
//            return true;
//        }else{
//            return false;
//        }
    }
}

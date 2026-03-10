package arrays;

import java.util.Scanner;

public class EjercicioEdadesNombres {

    public static void main(String[] args) {

        //Ejercicio: pedir al usuario cuántos amigos tiene
        //Crear un array de edades y otro de nombres, de longitud igual al nº de amigos
        //Con un bucle, ir pidiendo edad y nombre de cada amigo. Meter cada valor en cada array
        //Luego mostrar los datos: podéis hacerlo "a mano"
        System.out.println("Dime cuántos amigos tienes");
        Scanner teclado = new Scanner(System.in);
        int totalAmigos = teclado.nextInt();
        int[] edadesAmigos = new int[totalAmigos];
        String[] nombresAmigos = new String[totalAmigos];

        //Introduccion de datos
        for (int contAmigo = 0; contAmigo < totalAmigos ; contAmigo++) {
            System.out.println("Dime edad del amigo número " + (contAmigo +1));
            edadesAmigos[contAmigo] = teclado.nextInt();
            System.out.println("Dime el nombre del amigo número " + (contAmigo +1));
            teclado.nextLine();
            nombresAmigos[contAmigo] = teclado.nextLine();
        }

        //Impresion de los datos A MANO
        /*System.out.println("Edad del amigo1: " + edadesAmigos[0]);
        System.out.println("Nombre del amigo1: " + nombresAmigos[0]);

        System.out.println("Edad del amigo2: " + edadesAmigos[1]);
        System.out.println("Nombre del amigo2: " + nombresAmigos[1]);

        System.out.println("Edad del amigo3: " + edadesAmigos[2]);
        System.out.println("Nombre del amigo3: " + nombresAmigos[2]);
        */
        for(int cont = 0; cont < totalAmigos; cont++){
            System.out.println("Tu amigo " + nombresAmigos[cont] +
                    " tiene " + edadesAmigos[cont] + " años");
        }
    }
}

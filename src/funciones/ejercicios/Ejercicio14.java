package funciones.ejercicios;

import java.util.Scanner;

/**
 * Escribe una función que muestre por pantalla un triángulo como el del ejemplo. Deberá recibir dos parámetros: el carácter que se desea imprimir y el número de líneas del triángulo.
 */
public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime 1 caracter para el triangulo");
        String caracterTriangulo = teclado.nextLine();

        //TODO: incluir una validacion en la que, si el usuario no nos dice sólo una letra, no le dejemos seguir hasta que ponga sólo una letra.
        System.out.println("Dime num lineas del triangulo");
        int numLineas = teclado.nextInt();

        char letra = caracterTriangulo.charAt(0);
        imprimirTriangulo(letra, numLineas);
    }

    public static void imprimirTriangulo(char caracter, int numLineas){

        if(numLineas >=1){
            int numCaracteresMaximo = 1;
            int numEspaciosMax = numLineas - 1;

            for (int contFila = 0; contFila < numLineas; contFila++) {

                //1er for: pone espacios
                for (int contEspacios = 0; contEspacios < numEspaciosMax; contEspacios++) {
                    System.out.print(" ");
                }
                //2do for: poner caracteres.
                for (int contCaracteres = 1; contCaracteres <= numCaracteresMaximo; contCaracteres++) {
                    System.out.print(caracter);
                }
                System.out.println();
                numEspaciosMax--;
                numCaracteresMaximo +=2;
            }
        }else{
            System.out.println("El mínimo para el triangulo es 1 línea. Se ha introducido " + numLineas + " líneas");
        }


    }

}

package funciones.ejercicios;

import java.util.Scanner;

public class Ejercicio2Calculadora {

    /**
     * Adapta este código para que utilice funciones en todo lo que puedas.
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Bienvenido al sistema");
        Scanner teclado = new Scanner(System.in);

        int opcion;
        int numero1;
        int numero2;

        double potencia = 0;
        do {
            imprimirMenu();

            opcion = teclado.nextInt();

            System.out.println("Ok, primero te voy a pedir dos numeros");
            numero1 = teclado.nextInt();
            numero2 = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ok, vamos a sumar");
                    int resultado = sumar(numero1, numero2);
                    System.out.println("Resultado suma: " + resultado);
                    break;
                case 2:
                    System.out.println("Ok, vamos a dividir.");
                    //TODO
                    break;
                case 3:
                    System.out.println("Ok, vamos a hacer la potencia.");
                    potencia = calcularPotencia(numero1, numero2);
                    System.out.println("La potencia es: " + potencia);

                    break;
                case 4:
                    System.out.println("Ok, vamos a hacer la potencia tipo 2.");
                    potencia = calcularPotenciaTipo2(numero1, numero2);
                    System.out.println("El resultado es: " + potencia);


                case 0:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor pruebe de nuevo");
            }
        } while (opcion != 0);


    }

    public static int sumar(int num1, int num2){
        return num1 + num2;
    }

    public static double calcularPotencia(int num1, int num2){
        return Math.pow(num1, num2);
    }

    public static double calcularPotenciaTipo2(int num1, int num2){
        double potencia = calcularPotencia(Math.abs(num1), Math.abs(num2));

        if(num2 == 0){
            potencia = 1;
        }else if(num2 < 0){
            potencia = 1 / potencia;
        }
        return potencia;
    }

    public static void imprimirMenu(){
        System.out.println("Elija su opción");
        System.out.println("1 - Sumar");
        System.out.println("2 - Dividir");
        System.out.println("3 - Potencia");
        System.out.println("4 - Potencia tipo 2");
        System.out.println("0 - Salir");
    }

}

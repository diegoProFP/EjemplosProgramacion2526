package funciones;

import java.util.Scanner;

public class EjemploFunciones {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        imprimirMenuCustom(3);

        System.out.println("Dime numero 1");
        int numero1 = teclado.nextInt();
        System.out.println("Dime numero 2");
        int numero2 = teclado.nextInt();

        int res = suma(numero1, numero2);

        System.out.println("El resultado de la suma es: " + res);

        float resDivision = dividir(numero1, numero2);
        if(resDivision != 0){
            System.out.println("La division es: " + resDivision);
        }

    }

    public static int suma(int numA, int numB){
        int resultado = numA + numB;
        return resultado;
    }

    public static float dividir(int num1, int num2){
        float resultadoDivision = 0;
        if(num2 == 0){
            System.out.println("No es posible dividir por cero");
        }else{
            resultadoDivision = (float)num1 / num2;
        }

        return resultadoDivision;
    }

    /**
     * Funcion que imprime un menú por pantalla
     */
    public static void imprimirMenu(){

        System.out.println("Bienvenido a la calculadora");
        System.out.println("1. Sumar");
        System.out.println("2. Dividir");
        System.out.println("3. Multiplicar");
        System.out.println("4. Salir");
    }

    public static void imprimirMenuCustom(int numOpciones){

        System.out.println("Bienvenido a la calculadora");
        if(numOpciones >= 1){
            System.out.println("1. Sumar");
        }
        if(numOpciones >= 2){
            System.out.println("2. Dividir");
        }
        if(numOpciones >= 3){
            System.out.println("3. Multiplicar");
        }
        System.out.println("0. Salir");
    }



}

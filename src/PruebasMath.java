import java.util.Scanner;

public class PruebasMath {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Pedir numero1 al usuario
        System.out.println("Dime el numero 1");
        int numero1 = teclado.nextInt();

        //Pedir numero 2 al usuario
        System.out.println("Dime el numero 2");
        int numero2 = teclado.nextInt();

        //Calcular numero1 ^ numero 2
        double potencia = Math.pow(numero1, numero2);
        System.out.println("La potencia es: " + potencia);

        System.out.println("Maximo entre numeros: " + Math.max(5, 10));
        System.out.println("Redondeo un RA con 4.5: " + Math.round(4.4999999));

    }
}

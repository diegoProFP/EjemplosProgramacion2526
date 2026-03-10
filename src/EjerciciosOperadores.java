import java.util.Scanner;

public class EjerciciosOperadores {

    public static void main(String[] args) {

        /*
        Declara una constante float para PI
        Calcula el área de un circulo de radio 5.
        AREA = PI * radio * radio
        Muestra el valor resultante
         */
        final float PI = 3.1416f;
        int radio = 5;
        float area = PI * radio * radio;
        System.out.println("Area de un ciculo de radio " + radio + " es " + area);


        /*
        Crea una variable cn tu edad
        Dividela por 7
        Crea una variable booleana esViejo que tenga TRUE si el valor
        es mayor a 10
         */
        int edad = 80;
        float edadEntre7 = edad / 7f;//f, d, l
        System.out.println("Edad entre 7: " + edadEntre7);
        boolean esViejo = (edadEntre7 > 12) | (edad >= 80);
        System.out.println("Es viejo? : " + esViejo);

        //Lectura de datos del teclado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre = teclado.nextLine();

        System.out.println("Encantado de conocerle, Don/Dña " + nombre);

    }
}

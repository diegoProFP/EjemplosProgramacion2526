import java.sql.SQLOutput;
import java.util.Scanner;

public class EjemploSwitchDiaSemana {

    public static void main(String[] args) {
        /*
        Tenemos que pedir al usuario un dia de la semana
        en String. Utilizaremos un switch para mostrar por pantalla
        qué se va a hacer en cada día.
        De Lunes a Viernes, se mostrará AL INSTITUTO.
        El sábado, ESCAPE ROOM
        El domingo, CINE
        Para cualquier otro dia, mostraremos que no es válido
         */
        System.out.println("Dime un día de la semana y te digo lo que harás. Los posibles valores son:");
        System.out.println("LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO");
        Scanner teclado = new Scanner(System.in);
        String diaSemana = teclado.nextLine();
        switch (diaSemana){
            case "LUNES":
            case "MARTES":
            case "MIERCOLES":
            case "JUEVES":
            case "VIERNES":
                System.out.println("AL INSTITUTO!!");
                break;
            case "SABADO":
                System.out.println("Nos vamos al ESCAPE ROOM");
                break;
            case "DOMINGO":
                System.out.println("Nos vamos al CINE, a gastar");
                break;
            default:
                System.out.println("Día no válido");
        }

        //Pedir al usuario su edad
        System.out.println("Dime tu edad, por favor ");
        int edad = teclado.nextInt();
        teclado.nextLine();//SIRVE PARA LIMPIAR EL BUFFER DEL TECLADO DESPUES DE UN NUMERO

        //Mostrarla
        System.out.println("Me dices que tienes " + edad + " años");

        //Pedir al usuario su nombre
        System.out.println("Dime tu nombre por favor");
        String nombre = teclado.nextLine();
        System.out.println("Tu nombre es: " + nombre);
        //Mostrarlo

    }
}

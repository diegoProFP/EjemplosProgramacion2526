import java.util.Scanner;

public class EjemplosCondiciones {

    public static void main(String[] args) {

        float puntos = 0;
        System.out.println("Por favor introduzca su edad:");
        Scanner teclado = new Scanner(System.in);
        int edad = teclado.nextInt();

        System.out.println("Me dices que tienes " + edad + " años");

        if (edad < 0) {
            System.out.println("No se admiten edades negativas");
        } else {
            if (edad >= 18) {
                System.out.println("Eres mayor de edad");
                puntos += 5;
            } else if (edad == 17) {
                System.out.println("Casi!! Te doy más puntos");
                puntos += 1.5f;
            } else {
                System.out.println("Todavia no llegas");
                puntos += 1;
            }
        }

        System.out.println("Puntos: " + puntos);
        System.out.println("Fin del programa");

    }
}

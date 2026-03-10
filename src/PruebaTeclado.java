import java.util.Scanner;

public class PruebaTeclado {

    public static void main(String[] args) {
        //Pedimos la edad al usuario y se la decimos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tu edad,y tu altura y peso, por favor");
        int edad = teclado.nextInt();
        int altura = teclado.nextInt();
        teclado.nextLine();

        String nombreD = teclado.nextLine();
        int peso = teclado.nextInt();
        System.out.println("nombre = " + nombreD);
        System.out.println("peso = " + peso);

        System.out.println("Tu edad es: " + edad);
        System.out.println("Tu altura es: " + altura);

        System.out.println("Dime tu nombre");
        String nombre = teclado.nextLine();
        System.out.println("Tu nombre es: " + nombre);

    }
}

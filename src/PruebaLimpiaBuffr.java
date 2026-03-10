import java.util.Scanner;

public class PruebaLimpiaBuffr {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tamaño en GB");
        int tamanyo = teclado.nextInt();
//        teclado.nextLine();
        System.out.println("Dime unidad de medida");
        String unidad = teclado.nextLine();

        System.out.println("tamanyo = " + tamanyo);
        System.out.println("unidad = " + unidad);

    }
}

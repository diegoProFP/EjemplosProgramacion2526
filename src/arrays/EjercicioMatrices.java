package arrays;





import java.util.Random;
import java.util.Scanner;

//4º BONUS: que el 3º lo muestre de esta manera(ej para 3x2):
// 4.2   2.5
// 1.2   9.0
// 5.3   2.1
public class EjercicioMatrices {

    public static void main(String[] args) {
        //Pedir al usuario num filas,  num columnas
        //Crear una matriz con ese tamaño
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime filas y columnas, por favor");
        int numFilas = teclado.nextInt();
        int numColumnas = teclado.nextInt();

        System.out.println("Floor de 10.55: " + Math.floor(10.55));

        double[][] matriz = new double[numFilas][numColumnas];
        //2º Rellenarlo de valores aleatorios DECIMALES
        int longitudMatriz1aDim = matriz.length;
        int longitudMatriz2aDim = matriz[0].length;
        System.out.println("longitudMatriz1aDim = " + longitudMatriz1aDim);
        System.out.println("longitudMatriz2aDim = " + longitudMatriz2aDim);

        Random genAleatorios = new Random();
        for (int contFilas = 0; contFilas < longitudMatriz1aDim; contFilas++) {
            for (int contColumnas = 0; contColumnas < longitudMatriz2aDim; contColumnas++) {
                //Otra forma de generar números aleatorios
                matriz[contFilas][contColumnas] = Math.random() * 10;
//              //matriz[contFilas][contColumnas] = genAleatorios.nextDouble(0, 10.01);
            }
        }

        //3º Recorrer la matriz mostrando todos sus valores
        for (int contFilas = 0; contFilas < longitudMatriz1aDim; contFilas++) {
            for (int contColumnas = 0; contColumnas < longitudMatriz2aDim; contColumnas++) {
                //Otra forma de generar números aleatorios
                System.out.println(contFilas + ", " + contColumnas + " = " +
                        matriz[contFilas][contColumnas]);
            }
        }
    }
}

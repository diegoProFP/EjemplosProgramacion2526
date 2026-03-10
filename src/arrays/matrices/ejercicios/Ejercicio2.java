package arrays.matrices.ejercicios;

/*Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla
 */
public class Ejercicio2 {
    public static void main(String[] args) {

        int[][] tablaMultiplicar = new int[10][10];

        for (int fila = 0; fila < tablaMultiplicar.length; fila++) {

            int numero = fila+1;
            for (int columna = 0; columna < tablaMultiplicar[0].length; columna++) {
                int numero2 = columna+1;
                int producto = numero * numero2;
                tablaMultiplicar[fila][columna] = producto;
            }
        }

        for (int contFila = 0; contFila < tablaMultiplicar.length; contFila++) {
            for (int contColumna = 0; contColumna < tablaMultiplicar[0].length; contColumna++) {
                System.out.print(tablaMultiplicar[contFila][contColumna] + " ");
            }
            System.out.println();//para hacer un salto de línea
        }
        
    }
}

package arrays.repaso;

import java.util.Random;

public class RepasoMatrices {

    public static void main(String[] args) {

        int numFilas = 4;
        int numColumnas = 3;
        double[][] temperaturasPorCiudad = new double[numFilas][numColumnas];
        //Rellenar toda la matriz con temperaturas aleatorias entre 1º y 30º
        Random aleatorios = new Random();

        for (int fila = 0; fila < numFilas; fila++) {
            System.out.println("Fila: " + fila);
            for (int columna = 0; columna < numColumnas; columna++) {
                System.out.println("\t Col:" + columna);
                //generar num aleatorio
                double numAleatorio = aleatorios.nextDouble(1, 31);
                //meter num aleatorio en la CELDA
                temperaturasPorCiudad[fila][columna] = numAleatorio;

            }
        }

        //Mostrar tods los valores de la matriz
        for (int fila = 0; fila < temperaturasPorCiudad.length; fila++) {
            System.out.println("Temperaturas de la ciudad " + (fila+1));
            for (int col = 0; col < temperaturasPorCiudad[0].length; col++) {
                System.out.print(
                        redondear2Decimales(temperaturasPorCiudad[fila][col]) + "º ");
            }
            System.out.println();
        }

    }

    /**
     * Redondear a 2 decimales y devolver un float
     * @param valor
     * @return
     */
    public static float redondear2Decimales(double valor){

        valor *= 100;
        long numeroRedondeado = Math.round(valor);
        return numeroRedondeado / (float) 100;

    }
}

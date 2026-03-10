package arrays;

public class EjemploMatriz {

    public static void main(String[] args) {

        int numFilas = 2;
        int numColumnas = 3;
        int[][] matrizNotas = new int[numFilas][numColumnas];
        matrizNotas[0][0] = 8;
        matrizNotas[0][1] = 9;
        matrizNotas[0][2] = 15;

        matrizNotas[1][2] = 4;

        System.out.println("Longitud? :" + matrizNotas.length);

        for (int fila = 0; fila < numFilas; fila++) {
            for (int columna = 0; columna < numColumnas; columna++) {
                System.out.print(fila + "," + columna + " :");
                int nota = matrizNotas[fila][columna];
                System.out.println(nota);
            }
        }


        

    }
}

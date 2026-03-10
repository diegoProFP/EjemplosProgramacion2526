package poo;

import java.util.Scanner;

public class ProgramaCochesAleatorios {

    public static void main(String[] args) {

        System.out.println("¿Cuántos coches quieres generar aleatoriamente?");
        Scanner teclado = new Scanner(System.in);
        int numeroCoches = teclado.nextInt();
        Coche[] cochesAleatorios = new Coche[numeroCoches];
        for (int cont = 0; cont < numeroCoches; cont++) {
            cochesAleatorios[cont] = Coche.generarCocheAleatorio();
        }

        for (int cont = 0; cont < numeroCoches; cont++) {
            cochesAleatorios[cont].imprimirCoche();
        }

    }
}

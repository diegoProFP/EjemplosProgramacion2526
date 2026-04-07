package colecciones.ejercicios.cartas;

import java.util.Scanner;

public class ProgramaCartas {

    public static void main(String[] args) {
        System.out.println("Bienvenido al juego de cartas");

        JuegoCartas juego = new JuegoCartas();
        juego.inicializarBaraja();
        juego.barajar();

        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        do {
            imprimirMenu();
            opcion = teclado.nextInt();

            switch (opcion){
                case 1 -> juego.robarCarta();
                case 2 -> juego.verMano();
                case 3 -> juego.verCartasRestantes();
                case 4 -> {
                    System.out.println("Dime el numero de la carta que quieres descartar");
                    int numCarta = teclado.nextInt();
                    juego.descartarCarta(numCarta);
                }
                case 5 -> juego.mostrarEstadisticas();
            }
        } while (opcion != 0);

        System.out.println("¡Adiós!");
    }

    public static void imprimirMenu(){
        System.out.println("1. Robar carta");
        System.out.println("2. Ver mano");
        System.out.println("3. Ver cartas restantes");
        System.out.println("4. Descartar carta");
        System.out.println("5. Estadisticas (no implementado)");
        System.out.println("0. Salir");
    }
}

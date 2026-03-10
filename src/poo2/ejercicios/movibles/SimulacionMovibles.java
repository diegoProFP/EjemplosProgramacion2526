package poo2.ejercicios.movibles;

public class SimulacionMovibles {

    public static void main(String[] args) {
        /* Manera "tradicional"
        Movible[] elementos = new Movible[3];

        elementos[0]= new Jugador("Diego", 4,4,10);
        elementos[1]= new Robot("P50", 2,2,5);
        elementos[2]= new Enemigo(TipoEnemigo.FANTASMA, 0,0, 5);
        */

        Movible[] elementos = {
                new Jugador("Diego", 4,4,10),
                new Robot("P50", 2,2,50),
                new Enemigo(TipoEnemigo.FANTASMA, 0,0, 5)
        };

        for (int cont = 0; cont < elementos.length; cont++) {
            if(elementos[cont] != null){
                elementos[cont].mover(1,1);
                System.out.println(elementos[cont]);
                elementos[cont].mover(2,0);
                System.out.println(elementos[cont]);
                elementos[cont].mover(-1,3);
                System.out.println(elementos[cont]);
            }
        }



    }
}

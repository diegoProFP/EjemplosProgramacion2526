package poo.ejercicios.modificaciones;

public class PrincipalPunto {

    public static void main(String[] args) {


        Punto punto1 = new Punto(5, 0);

        System.out.println("Punto 1. X: " + punto1.getCoordX());
        System.out.println("Punto 1. Y: " + punto1.getCoordY());

        System.out.println("(muevo la coordX del primer punto...)");
        //punto1.coordX += 5;//¿cómo se haría esto con metodo set?
        punto1.setCoordX(punto1.getCoordX() + 5);

        System.out.println("Punto 1. X: " + punto1.getCoordX());
        System.out.println("Punto 1. Y: " + punto1.getCoordY());

        Punto punto2 = new Punto(3, 7);
        Punto punto3 = new Punto(-5, 20);

        System.out.println("Punto2:");
        punto2.imprime();
        System.out.println("Punto 3:");
        punto3.imprime();
        punto2.desplaza(-3, 3);
        System.out.println("Punto2:");
        punto2.imprime();

        System.out.println("Probamos la distancia entre puntos...");
        Punto punto4 = new Punto(-3, 3);
        Punto punto5 = new Punto(9, -2);
        punto4.imprime();
        punto5.imprime();
        System.out.println("La distancia entre los dos puntos es: "
                            + punto4.distancia(punto5));


        System.out.println("GENERACION DE PUNTO ALEATORIO");
        Punto aleatorio = Punto.creaPuntoAleatorio();
        aleatorio.imprime();

    }

    /**
     * Marco como obsoleto ya que tenemos disponible el
     * metodo imprime() de la clase Punto
     * @param unPunto
     * @see Punto
     */
    @Deprecated
    public static void imprimirPunto(Punto unPunto){
        System.out.println("(" + unPunto.getCoordX() + ", " + unPunto.getCoordY() + ")");
    }

}

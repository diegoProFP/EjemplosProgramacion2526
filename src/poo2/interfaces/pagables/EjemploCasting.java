package poo2.interfaces.pagables;

import poo2.agentes.Agente;
import poo2.agentes.Ninja;

public class EjemploCasting {

    public static void main(String[] args) {

        double numeroPi = Math.PI;
        System.out.println("Numero pi en decimal: " + numeroPi);
        int numeroPiEntero = (int) numeroPi;
        System.out.println("Numero pi en entero: " + numeroPiEntero);

        Pagable elemento = new Factura(100, 0.21);

        Factura fact = (Factura) elemento;
        fact.esFacturaLegal();

    }
}

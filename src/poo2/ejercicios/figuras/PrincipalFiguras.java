package poo2.ejercicios.figuras;

import poo.ejercicios.Punto;

import java.time.LocalDate;

public class PrincipalFiguras {

    public static void main(String[] args) {

        Figura circulito = new Circulo("Azul", true, TipoRellenado.COMPLETO, LocalDate.now(), 2);
        Figura rectangulito = new Rectangulo("Naranja", true, TipoRellenado.PARCIAL, LocalDate.now(), new Punto(2,1), new Punto(5,6));

        circulito.imprimirFigura();
        rectangulito.imprimirFigura();

        System.out.println("El perimetro del circulo es: " + circulito.calcularPerimetro());
        System.out.println("El perimetro del rectangulo es: " + rectangulito.calcularPerimetro());

        System.out.println("El area del circulo es: " + circulito.calcularArea());
        System.out.println("El area del rectangulo es: " + rectangulito.calcularArea());
    }
}

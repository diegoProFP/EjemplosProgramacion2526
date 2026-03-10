package poo2.ejercicios.figuras;

import poo.ejercicios.Punto;
import java.time.LocalDate;

public class Rectangulo extends Figura{

    private Punto punto1;
    private Punto punto2;

    public Rectangulo(String color, boolean rellenado, TipoRellenado tipo, LocalDate fechaCreacion, Punto punto1, Punto punto2) {
        super(color, rellenado, tipo, fechaCreacion);
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    @Override
    public double calcularPerimetro() {
        int base = obtenerBase();
        int altura = obtenerAltura();
        return (base *2) + (altura * 2);
    }
    @Override
    public double calcularArea() {
        return obtenerBase() * obtenerAltura();
    }


    public int obtenerBase() {
        return Math.abs(punto1.getCoordX() - punto2.getCoordX());
    }

    public int obtenerAltura() {
        return Math.abs(this.punto1.getCoordY() - this.punto2.getCoordY());
    }



    @Override
    public void imprimirFigura() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "punto1=" + punto1 +
                ", punto2=" + punto2 +
                '}';
    }
}

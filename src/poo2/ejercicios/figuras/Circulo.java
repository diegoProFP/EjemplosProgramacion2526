package poo2.ejercicios.figuras;

import java.time.LocalDate;

public class Circulo extends Figura{

    private double radio;

    public Circulo(String color, boolean rellenado, TipoRellenado tipo, LocalDate fechaCreacion, double radio) {
        super(color, rellenado, tipo, fechaCreacion);
        this.radio = radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public void imprimirFigura() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}

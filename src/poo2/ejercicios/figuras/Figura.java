package poo2.ejercicios.figuras;

import java.time.LocalDate;

public abstract class Figura {

    //color, el tipo de rellenado, si está rellenado y la fecha de
    //creación de la figura
    private String color;
    private boolean rellenado;
    //valores: parcial, completo, por puntos....
    private TipoRellenado tipo;
    private LocalDate fechaCreacion;

    public Figura(String color, boolean rellenado, TipoRellenado tipo, LocalDate fechaCreacion) {
        this.color = color;
        this.rellenado = rellenado;
        this.tipo = tipo;
        this.fechaCreacion = fechaCreacion;
    }

    public abstract double calcularPerimetro();
    public abstract double calcularArea();

    public abstract void imprimirFigura();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRellenado() {
        return rellenado;
    }

    public void setRellenado(boolean rellenado) {
        this.rellenado = rellenado;
    }

    public TipoRellenado getTipo() {
        return tipo;
    }

    public void setTipo(TipoRellenado tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}

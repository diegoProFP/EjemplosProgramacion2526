package poo2.interfaces.pagables;

import java.awt.event.PaintEvent;

/**
 * La entrada de cine es un elemento Pagable
 * El importe de una entrada de cine se calcula con el precio base,
 * y si es 3D, se le añade 2.5€
 * si es diaDelEspectador, se multiplica el precio por 0.80
 *
 * La generacion de ticket DEVUELVE toda la informacion
 */
public class EntradaCine implements Pagable, Imprimible{

    private String pelicula;
    private int sala;
    private double precioBase;
    private boolean es3D;
    private boolean esDiaEspectador;

    public EntradaCine(String pelicula, int sala, double precioBase, boolean es3D, boolean esDiaEspectador) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precioBase = precioBase;
        this.es3D = es3D;
        this.esDiaEspectador = esDiaEspectador;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isEs3D() {
        return es3D;
    }

    public void setEs3D(boolean es3D) {
        this.es3D = es3D;
    }

    public boolean isEsDiaEspectador() {
        return esDiaEspectador;
    }

    public void setEsDiaEspectador(boolean esDiaEspectador) {
        this.esDiaEspectador = esDiaEspectador;
    }

    @Override
    public String toString() {
        return "EntradaCine{" +
                "pelicula='" + pelicula + '\'' +
                ", sala=" + sala +
                ", precioBase=" + precioBase +
                ", es3D=" + es3D +
                ", esDiaEspectador=" + esDiaEspectador +
                '}';
    }

    @Override
    public double calcularImporte() {
        double total = precioBase;
        if(es3D)
            total += 2.5;
        if(esDiaEspectador)
            total *= 0.8;

        return total;
    }

    @Override
    public String generarTicket() {
        return "ENTRADA CINE ->" + pelicula +
                " | Sala " + sala +
                " | ¿ES 3D? " + (es3D ? "SI" : "NO") +
                " | ¿ES Dia del espectador? " + (esDiaEspectador ? "SI" : "NO") +
                " | Total: " + calcularImporte();
    }

    @Override
    public void imprimir() {
        System.out.println("*************");
        System.out.println(generarTicket());
        System.out.println("*************");
    }
}

package poo2.ejercicios.anillos.personajes;

import poo2.ejercicios.anillos.accesorios.Arco;
import poo2.ejercicios.anillos.accesorios.Carcaj;

public class Elfo extends PersonajeBueno{

    private Carcaj carjac;
    private Arco arco;


    public Elfo(String nombre, int coordX, int coordY) {
        super(nombre, coordX, coordY);
    }

    @Override
    public void moverse(int incrementoX, int incrementoY) {

    }

    @Override
    public void sanar() {

    }

    public Carcaj getCarjac() {
        return carjac;
    }

    public void setCarjac(Carcaj carjac) {
        this.carjac = carjac;
    }

    public Arco getArco() {
        return arco;
    }

    public void setArco(Arco arco) {
        this.arco = arco;
    }

    @Override
    public String toString() {
        return "Elfo{" +
                "carjac=" + carjac +
                ", arco=" + arco +
                ", nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", coordX=" + coordX +
                ", coordY=" + coordY +
                '}';
    }
}

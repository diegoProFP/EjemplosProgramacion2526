package poo2.agentes;

import java.util.Random;

public class Ninja extends Agente implements Infiltrador{

    public Ninja(String nombre) {
        super(nombre);
    }

    @Override
    public String obtenerTipoAgente() {
        return "Ninja";
    }

    @Override
    public double probabilidadExito() {
        return 75 - bonusInfiltracion();
    }

    @Override
    public double bonusInfiltracion() {
        return 0.5;
    }

    @Override
    public void retirada(String objetivo) {
        String misionCumplida = this.misionCompletada ? "SI" : "NO";
        System.out.println("El ninja con nombre: "  + nombre + " " + misionCumplida + " ha cumplido su misión para el objetivo "+ objetivo);

    }
}

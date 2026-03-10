package poo2.agentes;

import java.util.Random;

public class Diplomatico extends Agente{

    public Diplomatico(String nombre) {
        super(nombre);
    }

    @Override
    public String obtenerTipoAgente() {
        return "Diplomatico";
    }

    @Override
    public double probabilidadExito() {
        return 90;
    }

    @Override
    public void retirada(String objetivo) {
        String misionCumplida = this.misionCompletada ? "SI" : "NO";
        System.out.println("El diplomtico con nombre: "  + nombre + " " + misionCumplida + " ha cumplido su misión para el objetivo "+ objetivo);

    }
}

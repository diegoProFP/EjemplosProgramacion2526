package poo2.agentes;

import java.util.Random;

public class Hacker extends Agente implements Infiltrador{

    public Hacker(String nombre) {
        super(nombre);
        this.especialidadAgente = "Ciberseguridad y black hat";
    }

    @Override
    public String obtenerTipoAgente() {
        return "Hacker";
    }

    @Override
    public double probabilidadExito() {
        return 50 - bonusInfiltracion();
    }

    @Override
    public void retirada(String objetivo) {

        String misionCumplida = this.misionCompletada ? "SI" : "NO";
        System.out.println("El hacker con nombre: "  + nombre + " " + misionCumplida + " ha cumplido su misión para el objetivo "+ objetivo);
    }

    @Override
    public double bonusInfiltracion() {
        return 0.1;
    }
}

package poo2.ejercicios.anillos.accesorios;

public class Arco {

    private int nivelPrecision;
    private double tension;


    public int getNivelPrecision() {
        return nivelPrecision;
    }

    public void setNivelPrecision(int nivelPrecision) {
        this.nivelPrecision = nivelPrecision;
    }

    public double getTension() {
        return tension;
    }

    public void setTension(double tension) {
        this.tension = tension;
    }

    @Override
    public String toString() {
        return "Arco{" +
                "nivelPrecision=" + nivelPrecision +
                ", tension=" + tension +
                '}';
    }
}

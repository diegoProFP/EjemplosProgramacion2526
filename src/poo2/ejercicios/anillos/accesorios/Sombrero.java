package poo2.ejercicios.anillos.accesorios;

public class Sombrero {

    private int anchura;
    private int numPuntas;

    public Sombrero(int anchura, int numPuntas) {
        this.anchura = anchura;
        this.numPuntas = numPuntas;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public int getNumPuntas() {
        return numPuntas;
    }

    public void setNumPuntas(int numPuntas) {
        this.numPuntas = numPuntas;
    }

    @Override
    public String toString() {
        return "Sombrero{" +
                "anchura=" + anchura +
                ", numPuntas=" + numPuntas +
                '}';
    }
}

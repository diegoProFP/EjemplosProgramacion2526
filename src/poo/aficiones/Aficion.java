package poo.aficiones;

public class Aficion {

    private String nombre;
    private boolean esRiesgoso;
    private int nivelDificultad;

    public Aficion(String nombre) {
        this.nombre = nombre;
        this.esRiesgoso = false;
        this.nivelDificultad = 0;
    }

    public Aficion(String nombre, boolean esRiesgoso, int nivelDificultad) {
        this.nombre = nombre;
        this.esRiesgoso = esRiesgoso;
        this.nivelDificultad = nivelDificultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEsRiesgoso() {
        return esRiesgoso;
    }

    public void setEsRiesgoso(boolean esRiesgoso) {
        this.esRiesgoso = esRiesgoso;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    @Override
    public String toString() {
        return "Aficion{" +
                "nombre='" + nombre + '\'' +
                ", esRiesgoso=" + esRiesgoso +
                ", nivelDificultad=" + nivelDificultad +
                '}';
    }
}

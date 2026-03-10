package poo2.ejercicios.anillos.personajes;

public abstract class Personaje {

    protected String nombre;
    protected int vida;
    protected int coordX;
    protected int coordY;

    public Personaje(String nombre, int coordX, int coordY) {
        this.nombre = nombre;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public abstract void moverse(int incrementoX, int incrementoY);



    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", coordX=" + coordX +
                ", coordY=" + coordY +
                '}';
    }
}

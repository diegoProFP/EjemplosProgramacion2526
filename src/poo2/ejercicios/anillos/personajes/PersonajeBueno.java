package poo2.ejercicios.anillos.personajes;

public abstract class PersonajeBueno extends Personaje{

    public PersonajeBueno(String nombre, int coordX, int coordY) {
        super(nombre, coordX, coordY);
    }

    public abstract void sanar();
}

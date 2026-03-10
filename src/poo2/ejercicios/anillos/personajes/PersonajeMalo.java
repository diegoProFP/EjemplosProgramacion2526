package poo2.ejercicios.anillos.personajes;

public abstract class PersonajeMalo extends Personaje{


    public PersonajeMalo(String nombre, int coordX, int coordY) {
        super(nombre, coordX, coordY);
    }

    public abstract void gritar();
    public abstract void avisarASauron();
}

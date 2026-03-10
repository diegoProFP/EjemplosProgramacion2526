package poo2.ejercicios.anillos.personajes;

public class Nazgul extends PersonajeMalo{

    public Nazgul(String nombre, int coordX, int coordY) {
        super(nombre, coordX, coordY);
    }

    @Override
    public void gritar() {
        System.out.println("UAAUUUUUUUUU ");
    }

    @Override
    public void moverse(int incrementoX, int incrementoY) {

    }

    @Override
    public void avisarASauron() {
        System.out.println("Avisando a papá");
    }
}

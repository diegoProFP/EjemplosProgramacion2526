package poo2.ejercicios.anillos.personajes;

public class Orco extends PersonajeMalo{

    public Orco(String nombre, int coordX, int coordY) {
        super(nombre, coordX, coordY);
    }

    @Override
    public void moverse(int incrementoX, int incrementoY) {
        incrementoX = incrementoX /2;
        incrementoY = incrementoY /2;
    }

    @Override
    public void avisarASauron() {
        System.out.println("Sauron, vente");
    }

    @Override
    public void gritar() {
        System.out.println("chillidoooooooooo");
    }
}

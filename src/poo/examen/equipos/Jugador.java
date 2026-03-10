package poo.examen.equipos;

public class Jugador {

    public static final int MAX_MINUTOS = 120;
    public static final int MIN_DORSAL = 1;
    public static final int MAX_DORSAL = 99;

    private String nombre;
    private int dorsal;
    private int minutosJugados;
    private boolean lesionado;

    public Jugador(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.minutosJugados = 0;
        this.lesionado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }


    public int getMinutosJugados() {
        return minutosJugados;
    }

    public void setMinutosJugados(int minutosJugados) {
        this.minutosJugados = minutosJugados;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }
}

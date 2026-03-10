package poo.examen.equipos;

public class Equipo {

    public static final int MAX_JUGADORES = 5;
    public static final int NUM_SIGLAS = 3;

    private String nombre;
    private String siglas;
    private Entrenador entrenador;
    private Jugador[] plantilla = new Jugador[MAX_JUGADORES];
    private int numJugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public Equipo(String nombre, Entrenador entrenador) {
        this.nombre = nombre;
        this.entrenador = entrenador;
    }

    public boolean ficharJugador(Jugador jugadorNuevo){
        if(this.plantilla != null && jugadorNuevo != null){
            if(numJugadores >= MAX_JUGADORES){
                System.out.println("ERROR: PLANTILLA LLENA");
                return false;
            }

            if(jugadorNuevo.getDorsal() < Jugador.MIN_DORSAL || jugadorNuevo.getDorsal() > Jugador.MAX_DORSAL){
                System.out.println("ERROR: DORSAL INVALIDO ");
                return false;
            }

            //comprobar dorsal repetido
            for(int cont = 0; cont < plantilla.length; cont++){
                Jugador jugExistente = plantilla[cont];
                if(jugExistente != null && jugExistente.getDorsal() == jugadorNuevo.getDorsal()){
                    System.out.println("ERROR: DORSAL REPETIDO");
                    return false;
                }
            }

            //si llega aqui, está bien, podemos añadirlo al array
            plantilla[numJugadores++] = jugadorNuevo;

            System.out.println(String.format("Jugador %s con dorsal %d añadido al equipo %s",
                                    jugadorNuevo.getNombre(),
                                    jugadorNuevo.getDorsal(),
                                    this.nombre));
            return true;
        }

        return false;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Jugador[] getPlantilla() {
        return plantilla;
    }

    public int getNumJugadores() {
        return numJugadores;
    }

}

package poo.examen.equipos;

public class SimulacionEquiposPackB {
    public static void main(String[] args) {

        /*
        Crear 1 entrenador
o Crear 1 equipo y asignarle el entrenador
o Crea un array de 2 Jugadores, inserta dentro al menos 2 objetos de Jugador, y modifica sus
minutos jugados y su indicador de lesionado con el valor que elijas.
o Mostrar información básica por pantalla de todos los objetos consultando mediante los
getters la información de todos los objetos (prohibido usar toString() para ello).
         */
        Entrenador ancelotti = new Entrenador("Carlo Ancelotti", 25);
        Equipo rMadrid = new Equipo("REAL MADRID CLUB DE FÚTBOL", ancelotti);

        Jugador[] jugadores = new Jugador[2];
        Jugador vini = new Jugador("Vinícius Jr", 7);
        Jugador jude = new Jugador("Jude Bellingham", 5);

        rMadrid.ficharJugador(vini);
        rMadrid.ficharJugador(jude);


        System.out.println("=== SIMULACION EQUIPOS - PACK A ===");

        mostrarEntrenador(ancelotti);
        mostrarEquipo(rMadrid);
//        mostrarJugador(jugadores[0], 1);
//        mostrarJugador(jugadores[1], 2);

        System.out.println("=== FIN PACK A ===");
    }

    public static void mostrarEntrenador(Entrenador entrenador){
        System.out.println("[ENTRENADOR]");
        System.out.println("Nombre: " + entrenador.getNombre());
        System.out.println("Años de experiencia: " + entrenador.getAnyosExperiencia());
    }

    public static void mostrarEquipo(Equipo equipo){
        System.out.println("[EQUIPO]");
        System.out.println("Nombre: " + equipo.getNombre());
        System.out.println("Máx. jugadores: " + Equipo.MAX_JUGADORES);
        System.out.println("Entrenador asignado: " + equipo.getEntrenador().getNombre());
    }

    public static void mostrarJugador(Jugador jugador, int numero){
        System.out.println("[JUGADOR " + numero);
        System.out.println("Nombre: " + jugador.getNombre());
        System.out.println("Dorsal: " + jugador.getDorsal());
        System.out.println("Minutos jugados: " + jugador.getMinutosJugados());
        System.out.println("Lesionado: " + indicadorLesionado(jugador.isLesionado()));
    }

    public static String indicadorLesionado(boolean valor){
        return valor ? "SI" : "NO";
    }
}

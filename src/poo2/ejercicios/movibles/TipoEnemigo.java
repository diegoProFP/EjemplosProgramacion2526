package poo2.ejercicios.movibles;

public enum TipoEnemigo {

    ORCO, DRON, FANTASMA;

    public static int agresividadPorTipo(TipoEnemigo tipo){
        return switch (tipo) {
            case ORCO -> 10;
            case DRON -> 5;
            case FANTASMA -> 2;
            default -> 0;
        };
    }
}

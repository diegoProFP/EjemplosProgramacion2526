package poo2.ejercicios.vehiculos;

public class VehiculoAereo extends Vehiculo {
    private final int numeroAsientos;

    public VehiculoAereo(String matricula, String modelo, int numeroAsientos) {
        super(matricula, modelo, "AEREO");
        if (esPositivo(numeroAsientos)) {
            this.numeroAsientos = numeroAsientos;
        } else {
            System.err.println("El numero de asientos debe ser positivo");
            this.numeroAsientos = 0;
        }
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    @Override
    protected String getDatosImpresion() {
        return ", numeroAsientos=" + numeroAsientos;
    }
}

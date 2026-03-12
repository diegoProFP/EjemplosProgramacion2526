package poo2.ejercicios.vehiculos;

public class VehiculoAereo extends Vehiculo {
    private static final String PATRON_MATRICULA = "[A-Z]{4}\\d{6}";
    private static final String DESCRIPCION_MATRICULA = "4 letras mayusculas y 6 numeros";

    private final int numeroAsientos;

    public VehiculoAereo(String matricula, String modelo, int numeroAsientos) {
        super(matricula, modelo, PATRON_MATRICULA, DESCRIPCION_MATRICULA);
        validarPositivo(numeroAsientos, "El numero de asientos debe ser positivo");
        this.numeroAsientos = numeroAsientos;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    @Override
    protected String getDatosImpresion() {
        return ", numeroAsientos=" + numeroAsientos;
    }
}

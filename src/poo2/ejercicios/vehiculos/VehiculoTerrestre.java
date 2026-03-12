package poo2.ejercicios.vehiculos;

public class VehiculoTerrestre extends Vehiculo {
    private static final String PATRON_MATRICULA = "\\d{4}[A-Z]{3}";
    private static final String DESCRIPCION_MATRICULA = "4 numeros y 3 letras mayusculas";

    private final int numeroRuedas;

    public VehiculoTerrestre(String matricula, String modelo, int numeroRuedas) {
        super(matricula, modelo, PATRON_MATRICULA, DESCRIPCION_MATRICULA);
        validarPositivo(numeroRuedas, "El numero de ruedas debe ser positivo");
        this.numeroRuedas = numeroRuedas;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    @Override
    protected String getDatosImpresion() {
        return ", numeroRuedas=" + numeroRuedas;
    }
}

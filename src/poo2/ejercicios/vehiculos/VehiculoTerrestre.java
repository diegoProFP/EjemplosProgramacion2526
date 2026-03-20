package poo2.ejercicios.vehiculos;

public class VehiculoTerrestre extends Vehiculo {
    private final int numeroRuedas;

    public VehiculoTerrestre(String matricula, String modelo, int numeroRuedas) {
        super(matricula, modelo, "TERRESTRE");
        if (esPositivo(numeroRuedas)) {
            this.numeroRuedas = numeroRuedas;
        } else {
            System.err.println("El numero de ruedas debe ser positivo");
            this.numeroRuedas = 0;
        }
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    @Override
    protected String getDatosImpresion() {
        return ", numeroRuedas=" + numeroRuedas;
    }
}

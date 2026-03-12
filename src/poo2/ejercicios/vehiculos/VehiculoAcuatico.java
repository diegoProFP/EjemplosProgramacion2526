package poo2.ejercicios.vehiculos;

public class VehiculoAcuatico extends Vehiculo {
    private final double eslora;

    public VehiculoAcuatico(String matricula, String modelo, double eslora) {
        super(matricula, modelo, "ACUATICO");
        if (esPositivo(eslora)) {
            this.eslora = eslora;
        } else {
            System.err.println("La eslora debe ser positiva");
            this.eslora = 0;
        }
    }

    public double getEslora() {
        return eslora;
    }

    @Override
    protected String getDatosImpresion() {
        return ", eslora=" + eslora;
    }
}

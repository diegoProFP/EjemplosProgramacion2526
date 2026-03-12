package poo2.ejercicios.vehiculos;

public class VehiculoAcuatico extends Vehiculo {
    private static final String PATRON_MATRICULA = "[A-Z]{3,10}";
    private static final String DESCRIPCION_MATRICULA = "entre 3 y 10 letras mayusculas";

    private final double eslora;

    public VehiculoAcuatico(String matricula, String modelo, double eslora) {
        super(matricula, modelo, PATRON_MATRICULA, DESCRIPCION_MATRICULA);
        validarPositivo(eslora, "La eslora debe ser positiva");
        this.eslora = eslora;
    }

    public double getEslora() {
        return eslora;
    }

    @Override
    protected String getDatosImpresion() {
        return ", eslora=" + eslora;
    }
}

package poo2.ejercicios.vehiculos;

public class Helicoptero extends VehiculoAereo {
    private int numeroHelices;

    public Helicoptero(String matricula, String modelo, int numeroAsientos, int numeroHelices) {
        super(matricula, modelo, numeroAsientos);
        setNumeroHelices(numeroHelices);
    }

    public int getNumeroHelices() {
        return numeroHelices;
    }

    public void setNumeroHelices(int numeroHelices) {
        validarPositivo(numeroHelices, "El numero de helices debe ser positivo");
        this.numeroHelices = numeroHelices;
    }

    @Override
    protected String getDatosImpresion() {
        return super.getDatosImpresion() + ", numeroHelices=" + numeroHelices;
    }
}

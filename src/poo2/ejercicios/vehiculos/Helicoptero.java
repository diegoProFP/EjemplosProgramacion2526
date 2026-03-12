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
        if (esPositivo(numeroHelices)) {
            this.numeroHelices = numeroHelices;
        } else {
            System.err.println("El numero de helices debe ser positivo");
            this.numeroHelices = 0;
        }
    }

    @Override
    protected String getDatosImpresion() {
        return super.getDatosImpresion() + ", numeroHelices=" + numeroHelices;
    }
}

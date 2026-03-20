package poo2.ejercicios.vehiculos;

public class Avion extends VehiculoAereo {
    private double tiempoMaximoVuelo;

    public Avion(String matricula, String modelo, int numeroAsientos, double tiempoMaximoVuelo) {
        super(matricula, modelo, numeroAsientos);
        setTiempoMaximoVuelo(tiempoMaximoVuelo);
    }

    public double getTiempoMaximoVuelo() {
        return tiempoMaximoVuelo;
    }

    public void setTiempoMaximoVuelo(double tiempoMaximoVuelo) {
        if (esPositivo(tiempoMaximoVuelo)) {
            this.tiempoMaximoVuelo = tiempoMaximoVuelo;
        } else {
            System.err.println("El tiempo maximo de vuelo debe ser positivo");
            this.tiempoMaximoVuelo = 0;
        }
    }

    @Override
    protected String getDatosImpresion() {
        return super.getDatosImpresion() + ", tiempoMaximoVuelo=" + tiempoMaximoVuelo;
    }
}

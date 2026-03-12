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
        validarPositivo(tiempoMaximoVuelo, "El tiempo maximo de vuelo debe ser positivo");
        this.tiempoMaximoVuelo = tiempoMaximoVuelo;
    }

    @Override
    protected String getDatosImpresion() {
        return super.getDatosImpresion() + ", tiempoMaximoVuelo=" + tiempoMaximoVuelo;
    }
}

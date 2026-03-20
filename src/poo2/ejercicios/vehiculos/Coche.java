package poo2.ejercicios.vehiculos;

public class Coche extends VehiculoTerrestre {
    private boolean aireAcondicionado;

    public Coche(String matricula, String modelo, int numeroRuedas, boolean aireAcondicionado) {
        super(matricula, modelo, numeroRuedas);
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    @Override
    protected String getDatosImpresion() {
        return super.getDatosImpresion() + ", aireAcondicionado=" + aireAcondicionado;
    }
}

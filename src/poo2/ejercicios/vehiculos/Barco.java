package poo2.ejercicios.vehiculos;

public class Barco extends VehiculoAcuatico {
    private boolean tieneMotor;

    public Barco(String matricula, String modelo, double eslora, boolean tieneMotor) {
        super(matricula, modelo, eslora);
        this.tieneMotor = tieneMotor;
    }

    public boolean isTieneMotor() {
        return tieneMotor;
    }

    public void setTieneMotor(boolean tieneMotor) {
        this.tieneMotor = tieneMotor;
    }

    @Override
    protected String getDatosImpresion() {
        return super.getDatosImpresion() + ", tieneMotor=" + tieneMotor;
    }
}

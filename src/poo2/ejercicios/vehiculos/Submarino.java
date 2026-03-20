package poo2.ejercicios.vehiculos;

public class Submarino extends VehiculoAcuatico {
    private double profundidadMaxima;

    public Submarino(String matricula, String modelo, double eslora, double profundidadMaxima) {
        super(matricula, modelo, eslora);
        setProfundidadMaxima(profundidadMaxima);
    }

    public double getProfundidadMaxima() {
        return profundidadMaxima;
    }

    public void setProfundidadMaxima(double profundidadMaxima) {
        if (esNoNegativo(profundidadMaxima)) {
            this.profundidadMaxima = profundidadMaxima;
        } else {
            System.err.println("La profundidad maxima no puede ser negativa");
            this.profundidadMaxima = 0;
        }
    }

    @Override
    protected String getDatosImpresion() {
        return super.getDatosImpresion() + ", profundidadMaxima=" + profundidadMaxima;
    }
}

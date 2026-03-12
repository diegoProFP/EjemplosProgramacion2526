package poo2.ejercicios.vehiculos;

public class Moto extends VehiculoTerrestre {
    private String color;

    public Moto(String matricula, String modelo, int numeroRuedas, String color) {
        super(matricula, modelo, numeroRuedas);
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (esTextoValido(color)) {
            this.color = color;
        } else {
            System.err.println("El color no puede estar vacio");
            this.color = "Sin color";
        }
    }

    @Override
    protected String getDatosImpresion() {
        return super.getDatosImpresion() + ", color='" + color + '\'';
    }
}

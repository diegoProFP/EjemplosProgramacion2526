package poo2.interfaces.pagables;

public class Suscripcion implements Pagable {

    private double precioMensual;
    private int meses;

    public Suscripcion(double precioMensual, int meses) {
        this.precioMensual = precioMensual;
        this.meses = meses;
    }

    public double getPrecioMensual() {
        return precioMensual;
    }

    public int getMeses() {
        return meses;
    }

    @Override
    public String toString() {
        return "Suscripcion{" +
                "precioMensual=" + precioMensual +
                ", meses=" + meses +
                '}';
    }

    @Override
    public double calcularImporte() {
        return precioMensual * meses;
    }

    @Override
    public String generarTicket() {
        return "SUSCRIPCIÓN -> Meses: " + meses + ", precio mensual: " + precioMensual + " | TOTAL: " + calcularImporte();
    }
}

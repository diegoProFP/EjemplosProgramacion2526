package poo2.interfaces.pagables;

public class Factura implements Pagable, Imprimible{

    private double base;
    private final double iva;

    public Factura(double base, double iva) {
        this.base = base;
        this.iva = iva;
    }

    public boolean esFacturaLegal(){
        return false;
    }

    public double getBase() {
        return base;
    }

    public double getIva() {
        return iva;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "base=" + base +
                ", iva=" + iva +
                '}';
    }

    @Override
    public void imprimir() {
        System.out.println(generarTicket());
        System.out.println("*************");
    }

    @Override
    public String generarTicket() {
        return "FACTURA -> Base: " + base + ", IVA: " + (iva*100) + " %";
    }

    @Override
    public double calcularImporte() {
        //ej: base 100€ , IVa es 0.21 --> 100 * (1.21)
        return base * ( 1 + iva);
    }


}

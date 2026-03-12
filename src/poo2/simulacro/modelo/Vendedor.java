package poo2.simulacro.modelo;

public class Vendedor extends EmpleadoOperativo {

    private int ventasRealizadas;

    public Vendedor(int id, String nombre) {
        super(id, nombre, 20);
        this.ventasRealizadas = 0;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    @Override
    protected void actualizarContadorTrasIntento() {
        ventasRealizadas++;
        System.out.println("Ventas realizadas del vendedor " + nombre + ": " + ventasRealizadas);
    }

    @Override
    protected boolean resolverExito(int dificultad) {
        return dificultad <= 3;
    }

    @Override
    protected String obtenerTipoEmpleado() {
        return "VENDEDOR";
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("VENDEDOR -> ID: " + id
                + ", Nombre: " + nombre
                + ", Precio/hora: " + precioHora
                + ", Ventas realizadas: " + ventasRealizadas);
    }
}
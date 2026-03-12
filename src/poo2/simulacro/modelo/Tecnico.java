package poo2.simulacro.modelo;

public class Tecnico extends EmpleadoOperativo {

    private int trabajosCompletados;

    public Tecnico(int id, String nombre) {
        super(id, nombre, 30);
        this.trabajosCompletados = 0;
    }

    public int getTrabajosCompletados() {
        return trabajosCompletados;
    }

    public void setTrabajosCompletados(int trabajosCompletados) {
        this.trabajosCompletados = trabajosCompletados;
    }

    @Override
    protected void actualizarContadorTrasIntento() {
        trabajosCompletados++;
        System.out.println("Trabajos completados del técnico " + nombre + ": " + trabajosCompletados);
    }

    @Override
    protected boolean resolverExito(int dificultad) {
        return dificultad <= 3;
    }

    @Override
    protected String obtenerTipoEmpleado() {
        return "TÉCNICO";
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("TÉCNICO -> ID: " + id
                + ", Nombre: " + nombre
                + ", Precio/hora: " + precioHora
                + ", Trabajos completados: " + trabajosCompletados);
    }
}
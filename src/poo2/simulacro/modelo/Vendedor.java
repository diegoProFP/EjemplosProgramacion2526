package poo2.simulacro.modelo;

public class Vendedor extends EmpleadoOperativo{

    public static final int PRECIO_HORA_VENDEDOR = 20;
    private int ventasRealizadas;

    public Vendedor(String id, String nombreCompleto) {
        super(id, nombreCompleto, PRECIO_HORA_VENDEDOR);
    }



    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    @Override
    protected void actualizarDatos() {
        ventasRealizadas++;
        System.out.println("Yuhuuu he completado otro trabajo. Llevo " + ventasRealizadas + " completados");
    }

    @Override
    protected boolean resolverExito(int dificultad) {
        return dificultad <= 3;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Vendedor. Ventas realizadas: " + ventasRealizadas);
    }
}

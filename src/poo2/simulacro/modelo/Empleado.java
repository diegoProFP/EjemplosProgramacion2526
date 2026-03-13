package poo2.simulacro.modelo;

public abstract class Empleado {

    public static final int HORAS_POR_SEMANA = 40;
    public static final int SEMANAS_POR_MES = 4;
    protected String id;
    protected String nombreCompleto;
    protected double precioHora;

    public Empleado(String id, String nombreCompleto, double precioHora) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.precioHora = precioHora;
    }

    public String getId() {
        return id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void mostrarInformacion(){
        System.out.println("EMPLEADO " + id);
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Precio/hora: " + precioHora);

    }

    public double calcularNominaMensual(){
        return HORAS_POR_SEMANA * SEMANAS_POR_MES * precioHora;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", precioHora=" + precioHora +
                '}';
    }
}

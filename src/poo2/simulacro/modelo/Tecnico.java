package poo2.simulacro.modelo;

public class Tecnico extends EmpleadoOperativo{

    public static final int PRECIO_HORA_TECNICO = 30;
    private int trabajosCompletados;

    public Tecnico(String id, String nombreCompleto) {
        super(id, nombreCompleto, PRECIO_HORA_TECNICO);
    }



    public int getTrabajosCompletados() {
        return trabajosCompletados;
    }

    @Override
    protected void actualizarDatos() {
        trabajosCompletados++;
        System.out.println("Yuhuuu he completado otro trabajo. Llevo " + trabajosCompletados + " completados");
    }

    @Override
    protected boolean resolverExito(int dificultad) {
        return dificultad <= 3;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Técnico. Trabajos completados: " + trabajosCompletados);
    }
}

package poo2.simulacro.modelo;


import poo2.simulacro.ordenes.Ejecutor;

public abstract class EmpleadoOperativo extends Empleado implements Ejecutor {

    public EmpleadoOperativo(int id, String nombre, double precioHora) {
        super(id, nombre, precioHora);
    }

    @Override
    public final boolean ejecutarTarea(String descripcion, int dificultad) {
        System.out.println(obtenerTipoEmpleado() + " " + nombre
                + " comienza la tarea: " + descripcion);

        actualizarContadorTrasIntento();

        boolean exito = resolverExito(dificultad);

        if (exito) {
            System.out.println(obtenerTipoEmpleado() + " " + nombre
                    + " ha completado la tarea con éxito");
        } else {
            System.out.println(obtenerTipoEmpleado() + " " + nombre
                    + " no ha podido completar la tarea");
        }

        return exito;
    }

    protected abstract void actualizarContadorTrasIntento();

    protected abstract boolean resolverExito(int dificultad);

    protected abstract String obtenerTipoEmpleado();
}

package poo2.simulacro.modelo;

import poo2.simulacro.ordenes.Ejecutor;

public abstract class EmpleadoOperativo extends Empleado implements Ejecutor {


    public EmpleadoOperativo(String id, String nombreCompleto, double precioHora) {
        super(id, nombreCompleto, precioHora);
    }
/*
Mostrar un mensaje indicando que comienza la tarea.
2. Actualizar sus propios datos internos relacionados con su actividad.
3. Determinar si la tarea se ha podido completar con éxito.
4. Informar por pantalla del resultado.
 */
    @Override
    public final boolean ejecutarTarea(String descripcion, int dificultad) {
        System.out.println(" " + nombreCompleto + " comienza la tarea: " + descripcion);

        actualizarDatos();
        boolean exito = resolverExito(dificultad);
        if (exito){
            System.out.println("El empleado " + nombreCompleto + " ha completado la tarea con éxito");
        }else{
            System.out.println("El empleado " + nombreCompleto + " no ha podido completar la tarea");
        }

        return exito;
    }

    /**
     * Cada hijo deberá calcular el exito segun la dificultad y su propia especialidad
     * @param dificultad
     * @return
     */
    protected abstract boolean resolverExito(int dificultad);

    /**
     * Cada hijo deberá actualizar sus datos al ejecutar la tarea
     */
    protected abstract void actualizarDatos();
}

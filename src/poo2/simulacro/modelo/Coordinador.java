package poo2.simulacro.modelo;

import poo2.simulacro.ordenes.Mandador;

public class Coordinador extends Empleado implements Mandador {

    public static final int PRECIO_HORA_COORDINADOR = 40;
    public static final String PALABRA_CLAVE_VENTA = "venta";
    public static final String PALABRA_CLAVE_ARREGLAR = "arreglar";

    private EmpleadoOperativo[] empleadosACargo;

    private int numEmpleados;

    public Coordinador(String id, String nombreCompleto) {
        super(id, nombreCompleto, PRECIO_HORA_COORDINADOR);
        empleadosACargo = new EmpleadoOperativo[50];
    }

    public boolean aniadirEmpleadoACargo(EmpleadoOperativo empleado) {
        if (empleado == null) {
            System.out.println("No se puede añadir un empleado nulo");
            return false;
        }
        for (int cont = 0; cont < numEmpleados; cont++) {
            if (empleadosACargo[cont].getId().equalsIgnoreCase(empleado.getId())) {
                System.out.println("El empleado ya está asignado a este coordinador");
                return false;
            }
        }

        empleadosACargo[numEmpleados++] = empleado;
        System.out.println("Empleado " + empleado.getNombreCompleto() + " añadido al coordinador " + nombreCompleto);

        return true;
    }

    @Override
    public boolean mandarTarea(String descripcion, int dificultad) {

        boolean estadoTarea = false;

        System.out.println("El coordinador " + nombreCompleto + " recibe la tarea " + descripcion);

        if (numEmpleados > 0) {
            descripcion = descripcion.toLowerCase();
            for (int cont = 0; cont < numEmpleados; cont++) {

                if (descripcion.contains(PALABRA_CLAVE_VENTA)) {
                    //Esta linea nos comprueba si el objeto actual es una instancia de la clase Vendedor
                    if (empleadosACargo[cont] instanceof Vendedor) {
                        System.out.println("Se va a pasar la tarea al vendedor " + empleadosACargo[cont].getNombreCompleto());

                        //Le "pasamos" la tarea
                        return empleadosACargo[cont].ejecutarTarea(descripcion, dificultad);

                    }
                } else if (descripcion.contains(PALABRA_CLAVE_ARREGLAR)) {
                    if (empleadosACargo[cont] instanceof Tecnico) {
                        System.out.println("Se va a pasar la tarea al tecnico " + empleadosACargo[cont].getNombreCompleto());

                        //Le "pasamos" la tarea
                        return empleadosACargo[cont].ejecutarTarea(descripcion, dificultad);
                    }
                }
            }
        }

        System.out.println("No se ha encontrado ningún empleado que pueda asumir la tarea: " + descripcion);

        return estadoTarea;
    }
}



package poo2.simulacro.modelo;


import poo2.simulacro.ordenes.Mandador;

public class Coordinador extends Empleado implements Mandador {

    private EmpleadoOperativo[] empleadosACargo;
    private int numEmpleados;

    public Coordinador(int id, String nombre) {
        super(id, nombre, 40);
        empleadosACargo = new EmpleadoOperativo[50];
        numEmpleados = 0;
    }

    public boolean aniadirEmpleadoACargo(EmpleadoOperativo empleado) {

        if (empleado == null) {
            System.out.println("No se puede añadir un empleado nulo");
            return false;
        }

        for (int i = 0; i < numEmpleados; i++) {
            if (empleadosACargo[i].equals(empleado)) {
                System.out.println("El empleado ya está asignado al coordinador");
                return false;
            }
        }

        empleadosACargo[numEmpleados] = empleado;
        numEmpleados++;

        System.out.println("Empleado " + empleado.getNombre() + " añadido al coordinador " + nombre);

        return true;
    }

    @Override
    public boolean mandarTarea(String descripcion, int dificultad) {

        System.out.println("El coordinador " + nombre + " recibe la tarea: " + descripcion);

        String texto = descripcion.toLowerCase();

        if (texto.contains("venta")) {

            for (int i = 0; i < numEmpleados; i++) {

                if (empleadosACargo[i] instanceof Vendedor vendedor) {

                    System.out.println("Se asigna la tarea al vendedor " + vendedor.getNombre());

                    return vendedor.ejecutarTarea(descripcion, dificultad);
                }
            }

            System.out.println("No hay vendedores disponibles");
            return false;
        }

        if (texto.contains("arreglar")) {

            for (int i = 0; i < numEmpleados; i++) {

                if (empleadosACargo[i] instanceof Tecnico tecnico) {

                    System.out.println("Se asigna la tarea al técnico " + tecnico.getNombre());

                    return tecnico.ejecutarTarea(descripcion, dificultad);
                }
            }

            System.out.println("No hay técnicos disponibles");
            return false;
        }

        System.out.println("No se reconoce el tipo de tarea");

        return false;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("COORDINADOR -> ID: " + id
                + ", Nombre: " + nombre
                + ", Precio/hora: " + precioHora
                + ", Empleados a cargo: " + numEmpleados);
    }
}
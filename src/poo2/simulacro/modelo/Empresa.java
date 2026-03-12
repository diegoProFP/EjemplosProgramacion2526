package poo2.simulacro.modelo;

public class Empresa {

    private String nombre;
    private Empleado[] empleados;
    private int numEmpleados;
    private Coordinador coordinador;
    private double facturacion;

    public Empresa(String nombre) {
        this.nombre = nombre;
        empleados = new Empleado[100];
        numEmpleados = 0;
        facturacion = 0;
    }

    public boolean aniadirEmpleado(Empleado empleado) {

        if (empleado == null) {
            System.out.println("No se puede añadir un empleado nulo");
            return false;
        }

        for (int i = 0; i < numEmpleados; i++) {

            if (empleados[i].equals(empleado)) {

                System.out.println("El empleado ya existe en la empresa");
                return false;
            }
        }

        empleados[numEmpleados] = empleado;
        numEmpleados++;

        System.out.println("Empleado " + empleado.getNombre() + " añadido a la empresa " + nombre);

        return true;
    }

    public void setCoordinador(Coordinador coordinador) {

        this.coordinador = coordinador;

        if (coordinador != null) {
            System.out.println("Coordinador asignado: " + coordinador.getNombre());
        }
    }

    public void recibirTrabajo(String descripcion, double coste, int dificultad) {

        System.out.println("\n----- NUEVO TRABAJO -----");

        System.out.println("Descripción: " + descripcion);
        System.out.println("Coste: " + coste);
        System.out.println("Dificultad: " + dificultad);

        if (coordinador == null) {

            System.out.println("La empresa no tiene coordinador");
            return;
        }

        boolean realizado = coordinador.mandarTarea(descripcion, dificultad);

        if (realizado) {

            facturacion += coste;

            System.out.println("Trabajo completado. Facturación aumentada");
        }
        else {

            System.out.println("El trabajo no se ha podido completar");
        }

        System.out.println("Facturación actual: " + facturacion);
    }

    public void mostrarEmpleados() {

        System.out.println("\n===== EMPLEADOS =====");

        for (int i = 0; i < numEmpleados; i++) {

            empleados[i].mostrarInformacion();
        }
    }

    public double calcularTotalNominas() {

        double total = 0;

        for (int i = 0; i < numEmpleados; i++) {

            total += empleados[i].calcularNominaMensual();
        }

        return total;
    }

    public void mostrarFacturacion() {

        System.out.println("Facturación acumulada: " + facturacion);
    }

    public void mostrarTotalNominas() {

        System.out.println("Total nóminas mensuales: " + calcularTotalNominas());
    }
}
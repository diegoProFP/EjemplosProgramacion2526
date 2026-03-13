package poo2.simulacro.modelo;

public class Empresa {

    public static final int MAX_EMPLEADOS = 100;
    private String nombre;
    private Empleado[] empleados;
    private int numEmpleados;
    private Coordinador coordinador;
    private double facturacion;

    public Empresa(String nombre) {
        this.nombre = nombre;
        empleados = new Empleado[MAX_EMPLEADOS];
    }
    
    public boolean aniadirEmpleado(Empleado empleado){

        if (empleado == null) {
            System.out.println("No se puede añadir un empleado nulo");
            return false;
        }
        for (int cont = 0; cont < numEmpleados; cont++) {
            if (empleados[cont].getId().equalsIgnoreCase(empleado.getId())) {
                System.out.println("El empleado ya existe en la empresa");
                return false;
            }
        }

        empleados[numEmpleados++] = empleado;
        System.out.println("Empleado " + empleado.getNombreCompleto() + " añadido a la empresa " + nombre);

        return true;
    }

    public void recibirTrabajo(String descripcion, double coste, int dificultad){

        System.out.println("----- NUEVO TRABAJO RECIBIDO!! ------");
        System.out.println("descripcion = " + descripcion);
        System.out.println("coste = " + coste);
        System.out.println("dificultad = " + dificultad);

        if(coordinador != null){
            boolean tareaRealizada = coordinador.mandarTarea(descripcion, dificultad);
            if(tareaRealizada){
                facturacion += coste;
                System.out.println("Trabajo completado. Facturación aumentada");
            }else{
                System.out.println("El trabajo no se ha podido completar");

            }

            System.out.println("La facturación es de: " + facturacion);
        }else{
            System.out.println("No hay ningún coordinador para mandar la tarea");
        }
    }

    public void mostrarEmpleados() {

        System.out.println("\n===== EMPLEADOS =====");

        for (int i = 0; i < numEmpleados; i++) {

            empleados[i].mostrarInformacion();
        }
    }


    public double calcularNominas(){
        double total = 0;
        for (int cont = 0; cont < numEmpleados; cont++) {
            total += empleados[cont].calcularNominaMensual();
        }
        return total;
    }

    public void mostrarFacturacion() {

        System.out.println("Facturación acumulada: " + facturacion);
    }

    public void mostrarTotalNominas() {

        System.out.println("Total nóminas mensuales: " + calcularNominas());
    }


    public String getNombre() {
        return nombre;
    }

    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public int getNumEmpleados() {
        return numEmpleados;
    }

    public Coordinador getCoordinador() {
        return coordinador;
    }

    public double getFacturacion() {
        return facturacion;
    }
}

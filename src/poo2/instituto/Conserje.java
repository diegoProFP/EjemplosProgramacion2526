package poo2.instituto;

public class Conserje extends Empleado{

    private String funcion;

    public Conserje(String nombre, String apellidos, String dni, int codEmpleado, double sueldo, String funcion) {
        super(nombre, apellidos, dni, codEmpleado, sueldo);
        this.funcion = funcion;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
}

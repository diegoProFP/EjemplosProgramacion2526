package poo2.simulacro.modelo;

public abstract class Empleado {

    protected final int id;
    protected String nombre;
    protected double precioHora;

    public Empleado(int id, String nombre, double precioHora) {
        this.id = id;
        this.nombre = nombre;
        this.precioHora = precioHora;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double calcularNominaMensual() {
        return 40 * 4 * precioHora;
    }

    public abstract void mostrarInformacion();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Empleado otro)) {
            return false;
        }
        return this.id == otro.id;
    }

    @Override
    public String toString() {
        return "ID=" + id + ", nombre='" + nombre + "', precioHora=" + precioHora;
    }
}
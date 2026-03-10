package poo2.instituto;

public abstract class Persona {

    private String nombre;
    private String apellidos;
    private String dni;

    public Persona(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public void imprimirDatos(){
        System.out.println("** INFO DE LA PERSONA **");
        System.out.println("\t Nombre = " + nombre);
        System.out.println("\t Apellidos = " + apellidos);
        System.out.println("\t Dni = " + dni);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {



        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}

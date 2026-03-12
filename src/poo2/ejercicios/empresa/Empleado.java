package poo2.ejercicios.empresa;

public class Empleado implements ObligacionesHacienda{

    //nombre, DNI, sueldo bruto (mensual), edad, teléfono y dirección
    private final String nombre;
    private final String dni;
    private double sueldoBrutoMensual;
    private int edad;
    private String telefono;
    private String direccion;


    public Empleado(String nombre, String dni, double sueldoBrutoMensual) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBrutoMensual = sueldoBrutoMensual;
    }

    public void mostrarEmpleado(){
        System.out.println("Info del empleado: ");
        System.out.println("nombre: " + nombre);
        System.out.println("dni: " + dni);
        System.out.println("sueldoBrutoMensual: " + sueldoBrutoMensual);
        System.out.println("edad: " + edad);
        System.out.println("telefono: " + telefono);
        System.out.println("direccion: " + direccion);
    }

    public double calcularSueldoNetoMensual(){
        double irpf = obtenerPorcentajeIrpf();
        return sueldoBrutoMensual * (1 - irpf);
    }

    private double obtenerPorcentajeIrpf(){
        double sueldoBrutoAnual = sueldoBrutoMensual * 12;
        double porcIrpf = 0;
        if(sueldoBrutoAnual < 12_000){
            porcIrpf = 0.2;
        }else if(sueldoBrutoAnual <= 25_000){
            porcIrpf = 0.3;
        }else{
            porcIrpf = 0.4;
        }
        return porcIrpf;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSueldoBrutoMensual() {
        return sueldoBrutoMensual;
    }

    public void setSueldoBrutoMensual(double sueldoBrutoMensual) {
        this.sueldoBrutoMensual = sueldoBrutoMensual;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public double declarar() {
        return this.sueldoBrutoMensual * 0.10;
    }
}

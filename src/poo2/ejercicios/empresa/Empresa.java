package poo2.ejercicios.empresa;

public class Empresa implements ObligacionesHacienda{

    public static final double PORC_DECLARACION_HACIENDA = 0.25;
    /*
            Una empresa tiene nombre y CIF (datos que no pueden variar), además de teléfono,
        dirección y empleados. Cuando se crea una nueva empresa esta carece de empleados
             */
    private String nombre;
    private String cif;
    private String telefono;
    private String direccion;
    private Empleado[] empleados = new Empleado[10];
    private int contadorEmpleados = 0;
    private double facturacion;

    public Empresa(String nombre, String cif) {
        this.nombre = nombre;
        this.cif = cif;
    }

    public void anyadirEmpleado(Empleado emp){
        if(empleados != null){
            if(contadorEmpleados == empleados.length){
                System.out.println("Lo siento, lista de empleados llena");
            }else{
                System.out.println("Empleado insertado en posicion: " + contadorEmpleados);
                empleados[contadorEmpleados++] = emp;
            }
        }
    }

    public void mostrarDniSueldoBrutoYNeto(){
        if(contadorEmpleados == 0){
            System.out.println("No hay empleados en la empresa " + nombre);
        }else{
            for (int cont = 0; cont < empleados.length; cont++) {
                Empleado emp = empleados[cont];
                if(emp != null){
                    String plantillaMensaje = "DNI: %s | Bruto mensual: %f | Neto mensual: %f";
                    System.out.println(String.format(plantillaMensaje, emp.getDni(), emp.getSueldoBrutoMensual(), emp.calcularSueldoNetoMensual()));
                }
            }
        }
    }

    public double calcularSumaSueldosBrutos(){
        double suma = 0;
        for (int cont = 0; cont < empleados.length; cont++) {
            Empleado emp = empleados[cont];
            if(emp != null){
                suma += emp.getSueldoBrutoMensual();
            }

        }
        return suma;
    }
    public double calcularSumaSueldosNetos(){
        double suma = 0;
        for (int cont = 0; cont < empleados.length; cont++) {
            Empleado emp = empleados[cont];
            if(emp != null){
                suma += emp.calcularSueldoNetoMensual();
            }
        }
        return suma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
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

    public double getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(double facturacion) {
        this.facturacion = facturacion;
    }

    @Override
    public double declarar() {

        //recorrer todos los empleados,
        //sumar la declaracion de cada uno de ellos
        double totalDeclaracion = 0;
        for (int cont = 0; cont < contadorEmpleados; cont++) {
            totalDeclaracion += empleados[cont].declarar();
        }

        totalDeclaracion += facturacion * PORC_DECLARACION_HACIENDA;

        return totalDeclaracion;
    }
}

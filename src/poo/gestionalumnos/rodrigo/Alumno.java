package poo.gestionalumnos.rodrigo;

public class Alumno {

    private String nombre;
    private int edad;
    private String curso;
    private double notaMedia;
    private String dni;

    public Alumno (String nombreInicial,
                   int edadInicial,
                   String cursoInicial,
                   double notaMediaInicial,
                   String dniInicial) {
        nombre = nombreInicial;
        edad = edadInicial;
        curso = cursoInicial;
        notaMedia = notaMediaInicial;
        dni = dniInicial;
    }

    public Alumno (String nombreInicial,
                   int edadInicial,
                   String cursoInicial,
                   double notaMediaInicial) {
        nombre = nombreInicial;
        edad = edadInicial;
        curso = cursoInicial;
        notaMedia = notaMediaInicial;
    }

//-----------------MÉTODOS-------------------
    public void mostrarInfo(){


        System.out.println("---DATOS DEL ALUMNO---");
        System.out.println("Alumno: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
        System.out.println("Nota media: " + notaMedia);
        if(dni != null){
            System.out.println("DNI: " + dni);
        }
    }

    //TODO: redondear la nota para considerar aprobado
    public boolean estaAprobado(){
        boolean aprobado;
        if (notaMedia >= 5){
            aprobado = true;
        } else {
            aprobado = false;
        }
        return aprobado;
    }

    public boolean esMayorDeEdad(){
        return edad >= 18;
    }

    public void aprobado(){
        //TODO
    }


    /**
     * Recibe los puntos que debe incrementar a la nota media
     * @param puntos Puntos que se van a sumar a la nota
     */
    public void subirNota(double puntos){
        notaMedia += puntos;
    }


    //-----------------------------------------
    public String getDni(){
        return dni;
    }
    //no ponemos el setDni porque nos han dicho que nunca se le cambia el valor

    //-----------------------------------------
    public String getNombre(){
        return nombre;
    }
    public void setNombre (String nuevoNombre) {
        nombre = nuevoNombre;
    }

    //----------------------------------------------
    public void setEdad (int nuevaEdad) {
        edad = nuevaEdad;
    }
    public int getEdad(){
        return edad;
    }
    //-----------------------------------------------
    public void setCurso (String nuevoCurso) {
        curso = nuevoCurso;
    }
    public String getCurso(){
        return curso;
    }
    //-----------------------------------------------
    public void setNotaMedia (double nuevaNotaMedia){
        if(nuevaNotaMedia < 0 || nuevaNotaMedia > 10){
            System.out.println("Nota media no admitida: " + nuevaNotaMedia);
        }else{
            notaMedia = nuevaNotaMedia;
        }
    }
    public double getNotaMedia(){
        return notaMedia;
    }
    //-----------------------------------------------
}

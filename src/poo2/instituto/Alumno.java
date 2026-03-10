package poo2.instituto;

public class Alumno extends Persona{

    private String codExpediente;
    private String curso;

    public Alumno(String nombre, String apellidos, String dni, String codExpediente, String curso) {
        super(nombre, apellidos, dni);
        this.codExpediente = codExpediente;
        this.curso = curso;
    }

    @Override
    public void imprimirDatos(){

        super.imprimirDatos();

        System.out.println("*** INFO DEL ALUMNO ***");
        System.out.println("codExpediente = " + codExpediente);
        System.out.println("curso = " + curso);

    }

    public String getCodExpediente() {
        return codExpediente;
    }

    public void setCodExpediente(String codExpediente) {
        this.codExpediente = codExpediente;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {

        return super.toString() + " - Alumno{" +
                "codExpediente='" + codExpediente + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }
}

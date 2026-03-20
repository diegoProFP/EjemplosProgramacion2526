package colecciones;

import java.util.Objects;

public class Estudiante {

    private int numEstudiante;
    private String nombre;

    public Estudiante(int numEstudiante, String nombre) {
        this.numEstudiante = numEstudiante;
        this.nombre = nombre;
    }

    public int getNumEstudiante() {
        return numEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "numEstudiante=" + numEstudiante +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return numEstudiante == that.numEstudiante;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numEstudiante);
    }
}

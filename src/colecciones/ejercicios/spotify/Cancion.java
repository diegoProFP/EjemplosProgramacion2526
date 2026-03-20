package colecciones.ejercicios.spotify;

import java.util.Objects;

public class Cancion {

    private String nombre;
    private int numSegundos;
    private String genero;
    private int anioCreacion;
    private boolean tieneLetra;

    public Cancion(String nombre, int nSegundos) {
        this(nombre, nSegundos, "Desconocido", 0, false);
    }

    public Cancion(String nombre, int nSegundos, String genero, int anio, boolean letra) {
        this.nombre = nombre;
        this.numSegundos = nSegundos;
        this.genero = genero;
        this.anioCreacion = anio;
        this.tieneLetra = letra;
    }

    public double obtenerDuracionMinutos() {
        return numSegundos / 60.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevo) {
        this.nombre = nuevo;
    }

    public int getNumSegundos() {
        return numSegundos;
    }

    public void setNumSegundos(int nuevo) {
        this.numSegundos = nuevo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String nuevo) {
        this.genero = nuevo;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anio) {
        this.anioCreacion = anio;
    }

    public boolean isTieneLetra() {
        return tieneLetra;
    }

    public void setTieneLetra(boolean tiene) {
        this.tieneLetra = tiene;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cancion)) {
            return false;
        }
        Cancion cancion = (Cancion) o;
        return nombre != null && cancion.nombre != null
                && nombre.equalsIgnoreCase(cancion.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre == null ? null : nombre.toLowerCase());
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n"
                + "Duracion: " + numSegundos + " segundos (" + obtenerDuracionMinutos() + " min)\n"
                + "Genero: " + genero + "\n"
                + "Anio creacion: " + anioCreacion + "\n"
                + "Tiene letra: " + tieneLetra;
    }
}

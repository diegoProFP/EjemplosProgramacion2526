package poo.examen.equipos;

public class Entrenador {

    private String nombre;
    private int anyosExperiencia;

    public Entrenador(String nombre, int anyosExperiencia) {
        this.nombre = nombre;
        this.anyosExperiencia = anyosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnyosExperiencia() {
        return anyosExperiencia;
    }

    public void setAnyosExperiencia(int anyosExperiencia) {
        this.anyosExperiencia = anyosExperiencia;
    }
}

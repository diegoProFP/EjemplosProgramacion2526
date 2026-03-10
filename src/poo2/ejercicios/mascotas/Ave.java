package poo2.ejercicios.mascotas;

import java.time.LocalDate;

public abstract class Ave extends Mascota {

    protected String pico;
    protected boolean vuela;

    public Ave(String nombre, int edad, EstadoMascota estado, LocalDate fechaNacimiento, String pico, boolean vuela) {
        super(nombre, edad, estado, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }

    public abstract void volar();
}

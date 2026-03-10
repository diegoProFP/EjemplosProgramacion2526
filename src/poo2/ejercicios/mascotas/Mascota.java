package poo2.ejercicios.mascotas;

import java.time.LocalDate;

public abstract class Mascota {

    protected String nombre;
    protected int edad;
    protected EstadoMascota estado;
    protected LocalDate fechaNacimiento;

    public Mascota(String nombre, int edad, EstadoMascota estado, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }

    public abstract void muestra();
    public abstract void habla();

    public void morir(){
        estado = EstadoMascota.MUERTO;
        System.out.println("Mascota muerta: " + this.nombre);
    }

    public void cumpleaños(){
        if(fechaNacimiento.equals(LocalDate.now())){
            System.out.println("Hoy es el cumpleaños de la mascota " + nombre);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public EstadoMascota getEstado() {
        return estado;
    }

    public void setEstado(EstadoMascota estado) {
        this.estado = estado;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}

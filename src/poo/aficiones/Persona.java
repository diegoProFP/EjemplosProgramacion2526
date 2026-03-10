package poo.aficiones;

import poo.dawbank.movimiento.Utils;

import java.util.Arrays;

/**
 * Ejemplo para utilizar arrays de objetos en la clase
 */
public class Persona {

    public static final int MAX_HOBBIES = 5;
    private String nombre;
    private int edad;
    private Aficion[] hobbies = new Aficion[MAX_HOBBIES];
    private int numeroHobbies = 0;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        if(edad < 0){
            System.err.println("No se puede tener edad menor a 0");
        }else{
            this.edad = edad;
        }
    }

    public void agregarHobbie(Aficion nuevo){
        //TODO: aqui faltaria comprobar si el array está lleno, etc
        hobbies[numeroHobbies] = nuevo;
        numeroHobbies++;
        this.edad++;
    }
    public void mostrarHobbies(){
        for (int cont = 0; cont < numeroHobbies; cont++) {
            Aficion hob = hobbies[cont];
            System.out.println("Hobbie número " + (cont+1));
            System.out.println("\t Nombre: " + hob.getNombre());
            System.out.println("\t Dificultad: " + hob.getNivelDificultad());
            System.out.println("\t ¿Es Riesgoso?: " + Utils.convertirBooleanAString(hob.isEsRiesgoso()));
        }
    }
    
    public void mostrarHobbiesRiesgosos(){
        System.out.println("** MOSTRANDO HOBBIES RIESGOSOS ** ");
        for (int pos = 0; pos < hobbies.length; pos++) {
            Aficion hob = hobbies[pos];
            //SPOILER: alguno será nulo y dará error
            if(hob != null && hob.isEsRiesgoso()){
                System.out.println("\t Nombre: " + hob.getNombre());
                System.out.println("\t Dificultad: " + hob.getNivelDificultad());
                System.out.println("\t ¿Es Riesgoso?: " + Utils.convertirBooleanAString(hob.isEsRiesgoso()));

            }
        }
    }

    public int getNumeroHobbies() {
        return numeroHobbies;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombreYEdadALaVez(String nuevoNombre, int nuevaEdad){
        this.nombre = nuevoNombre;
        if(nuevaEdad > 100){
            System.err.println("Edad invalida: " + nuevaEdad);
        }else{
            this.edad = nuevaEdad;
        }
    }
    public Aficion[] getHobbies() {
        return hobbies;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", hobbies=" + Arrays.toString(hobbies) +
                '}';
    }
}

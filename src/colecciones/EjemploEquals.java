package colecciones;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class EjemploEquals {

    public static void main(String[] args) {

        ArrayList<Estudiante> estudiantes = generarListaEstudiantes();

        System.out.println(estudiantes);
        System.out.println();
        System.out.println("POSICION DEL ESTUDIANTE NUM 3: " + estudiantes.indexOf(new Estudiante(3, "")) );


        System.out.println("BORRAMOS ESTUDIANTE NUM 3");

        estudiantes.remove(new Estudiante(3,""));
        System.out.println();
        System.out.println(estudiantes);
        System.out.println("Tamaño de la lista despues de eliminar: " + estudiantes.size());
    }

    private static ArrayList<Estudiante> generarListaEstudiantes(){
        ArrayList<Estudiante> alumnos = new ArrayList<>();
        alumnos.add(new Estudiante(1, "Paco"));
        alumnos.add(new Estudiante(2, "Luis"));
        alumnos.add(new Estudiante(3, "Johnny"));
        alumnos.add(new Estudiante(4, "Juana"));
        alumnos.add(new Estudiante(5, "Luisa"));
        return alumnos;
    }

}

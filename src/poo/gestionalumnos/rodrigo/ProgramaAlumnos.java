package poo.gestionalumnos.rodrigo;

import java.util.Scanner;

public class ProgramaAlumnos {

    public static void main(String[] args0 ) {



        Alumno alumnoAlejandro = new Alumno("Alejandro",
                21,
                "1ºESO",
                7, "54852145P");
        alumnoAlejandro.mostrarInfo();

        if(alumnoAlejandro.estaAprobado()){
            System.out.println(alumnoAlejandro.getNombre() + " está aprobado");
        }else{
            System.out.println(alumnoAlejandro.getNombre() + " ha suspendido");
        }

        Alumno alumnoJesus = new Alumno("Jesús",
                16,
                "4ºESO",
                5);
        alumnoJesus.mostrarInfo();

        if(alumnoJesus.estaAprobado()){
            System.out.println(alumnoJesus.getNombre() + " está aprobado");
        }else{
            System.out.println(alumnoJesus.getNombre() + " ha suspendido");
        }

        Alumno alumnoIvan = new Alumno("Iván",
                14,
                "2ºESO",
                2);
        alumnoIvan.mostrarInfo();
        if(alumnoIvan.estaAprobado()){
            System.out.println(alumnoIvan.getNombre() + " está aprobado");
        }else{
            System.out.println(alumnoIvan.getNombre() + " ha suspendido");
        }


        //PARTE 3
        System.out.println("***** PARTE 3 **** ");
        System.out.println("Cambiamos la nota del alumno: " + alumnoAlejandro.getNombre());
        //Altero, asigno, modifico la nota media de ese alumno
        alumnoAlejandro.setNotaMedia(4.9);
        if(alumnoAlejandro.estaAprobado()){
            System.out.println(alumnoAlejandro.getNombre() + " está aprobado");
        }else{
            System.out.println(alumnoAlejandro.getNombre() + " ha suspendido");
        }

        System.out.println("Cambiamos el curso del alumno: " + alumnoAlejandro.getNombre());
        System.out.println("Curso actual: " + alumnoAlejandro.getCurso());
        alumnoAlejandro.setCurso("2º ESO");
        System.out.println("Curso nuevo: " + alumnoAlejandro.getCurso());

        alumnoAlejandro.mostrarInfo();

        System.out.println("***** PARTE 4 **** ");
        System.out.println();
        //Compara la nota media de dos alumnos

        alumnoIvan.setNotaMedia(alumnoJesus.getNotaMedia());
        if(alumnoJesus.getNotaMedia() > alumnoIvan.getNotaMedia()){
            System.out.println(alumnoJesus.getNombre() + " ha sacado más que  " + alumnoIvan.getNombre());
        }else if(alumnoIvan.getNotaMedia() > alumnoJesus.getNotaMedia()){
            System.out.println(alumnoIvan.getNombre() + " ha sacado más que " + alumnoJesus.getNombre());
        }else{
            System.out.println("Tanto " + alumnoIvan.getNombre() + " como " + alumnoJesus.getNombre() + " han sacado lo mismo");
        }
        System.out.println("***** PARTE 5 OPCIONAL **** ");
        System.out.println("\t subir la nota:");

        System.out.println("Vamos a subirle la nota a Jesús. Introduce cuántos puntos se incrementa la nota. Si quieres bajarle la nota pon un nº negativo");
        Scanner teclado = new Scanner(System.in);

        double puntosAIncrementar = teclado.nextDouble();

        alumnoJesus.subirNota(puntosAIncrementar);

        alumnoJesus.mostrarInfo();

        System.out.println("\t asignar nota media fuera de rango:");
        System.out.println();

        //Mostrando la nota media
        System.out.println("Nota media de " + alumnoAlejandro.getNombre() + ": " + alumnoAlejandro.getNotaMedia());
        //Intnto cambiar la nota media
        alumnoAlejandro.setNotaMedia(11);

        //Vuelvo a motrar la nota media
        System.out.println("Nota media de " + alumnoAlejandro.getNombre() + ": " + alumnoAlejandro.getNotaMedia());


        if(alumnoAlejandro.esMayorDeEdad()){
            System.out.println(alumnoAlejandro.getNombre() + " es mayor de edad");
        }

        if(alumnoJesus.esMayorDeEdad()){
            System.out.println(alumnoJesus.getNombre() + " es mayor de edad");
        }

        if(alumnoIvan.esMayorDeEdad()){
            System.out.println(alumnoIvan.getNombre() + " es mayor de edad");
        }


    }
}
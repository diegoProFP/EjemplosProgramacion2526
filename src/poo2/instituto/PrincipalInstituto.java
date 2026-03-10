package poo2.instituto;

public class PrincipalInstituto {

    public static void main(String[] args) {

        Alumno jesus = new Alumno("Jesus", "López", "44464654A", "123465ABC", "1DAW");

        System.out.println(jesus);
      //  jesus.imprimirDatos();

        Profesor paquito = new Profesor("Paquito", "Perez", "4654879A", 1, 15000, "Educación Física");

        System.out.println(paquito);
    //   paquito.imprimirDatos();
/*
        Conserje pepe = new Conserje("Pepe", "El Manitas", "54646464M", 2, 10000, "Mantenimiento");

        pepe.imprimirDatos();

        System.out.println("El alumno " +  jesus.getNombre() + " cursa en " + jesus.getCurso());
        System.out.println("El profesor " +  paquito.getNombre() + " es especialista en " + paquito.getEspecialidad());
        System.out.println("El conserje " +  pepe.getNombre() + " tiene como función " + pepe.getFuncion());

        pepe.setSueldo(13000);
        System.out.println("El conserje " +  pepe.getNombre() + " pasa a cobrar " + pepe.getSueldo());


*/

    }
}

package poo.biblioteca;

import java.time.LocalDateTime;

public class ProgramaBiblioteca {

    /*
  Cien años de soledad / ISBN: 978-0307455290 / Género: Realismo mágico / Autor: Gabriel García Márquez / 464 páginas. Amazon
1984 / ISBN: 978-0451524935 / Género: Distopía / Autor: George Orwell / 336 páginas. Agapea
Orgullo y prejuicio / ISBN: 978-0486284736 / Género: Novela romántica / Autor: Jane Austen / 256 páginas. Dover Publications
     */
    public static void main(String[] args) {

        Libro soledad = new Libro("Cien años de soledad", "978-0307455290", 464, "Novela mágica");
        Libro libro1984 = new Libro("1984","978-0451524935", 336, "Distopía");
        Libro orgullo = new Libro("Orgullo y Prejuicio", "978-0486284736", 256, "Novela romántica");

        Autor gabriel = new Autor("Gabriel", "García Márquez", "Colombiana", 1929);
        Autor orwell = new Autor("George", "Orwell", "Británica", 1903);

        soledad.setEscritor(gabriel);
        orgullo.setEscritor(gabriel);
        libro1984.setEscritor(orwell);

        System.out.println(soledad);
        System.out.println();
        System.out.println(orgullo);
        System.out.println();
        System.out.println(libro1984);

        //¿Cuál es la nacionalidad del autor de Cien Años de Soledad?
        System.out.println("la nacionalidad del autor de Cien Años de Soledad es....");

        String nacionalidadSoledad = soledad.getEscritor().getNacionalidad();
        System.out.println(nacionalidadSoledad);


        //Mostrar el año de nacimiento del autor de 1984
        int anyoNacimiento1984 = libro1984.getEscritor().getAnyoNacimiento();
        System.out.println("El año de nacimiento del autor de 1984 es: "+ anyoNacimiento1984);

        //Mostrar el género de Orgullo y Prejuicio
        System.out.println("El genero de Orgullo y PRejuicio es: " + orgullo.getGenero());

        //Mostrar la media de paginas entre los 3 libros
        double mediaPaginas = (soledad.getNumPaginas() + orgullo.getNumPaginas() + libro1984.getNumPaginas()) / 3d;
        System.out.println("La media de paginas de los 3 libros es: " + mediaPaginas);

        //Mostrar la media de edades de los autores de los 3 libros. Considerando el año actual
        int edadAutorSoledad = calcularEdadSegunAnyoNacimiento(
                                    soledad.getEscritor().getAnyoNacimiento());
        int edadAutorOrgullo = calcularEdadSegunAnyoNacimiento(
                                    orgullo.getEscritor().getAnyoNacimiento());
        int edad1984 = calcularEdadSegunAnyoNacimiento(
                                    libro1984.getEscritor().getAnyoNacimiento());

        System.out.println("La media de edades de los autores de los 3 libros es " + (edadAutorSoledad + edadAutorOrgullo + edad1984) / 3);


    }

    private static int calcularEdadSegunAnyoNacimiento(int anyoNacimiento){
        int anyoActual = LocalDateTime.now().getYear();
        return anyoActual - anyoNacimiento;
    }
}









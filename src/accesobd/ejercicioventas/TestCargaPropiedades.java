package accesobd.ejercicioventas;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class TestCargaPropiedades {

    public static void main(String[] args) {

        try {
            String usuario = PropiedadesProyecto.obtenerPropiedad("db.user");
            System.out.println("El usuario de BD es = " + usuario);
            String pass = PropiedadesProyecto.obtenerPropiedad("db.pass");
            System.out.println("La pass de BD es = " + pass);

            boolean status = PropiedadesProyecto.obtenerPropiedadBoolean("enable-status");
            System.out.println("status = " + status);

        } catch (NoSuchFileException e) {
            System.err.println("No existe ningun fichero de properties con ese nombre: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ha ocurrido un problema al cargar las properties: " + e);
        }
    }
}

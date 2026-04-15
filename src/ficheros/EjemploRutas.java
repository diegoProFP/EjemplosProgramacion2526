package ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class EjemploRutas {

    public static void main(String[] args) {

        //Este fichero sólo está en mi ruta. Por favor, coged alguno en vuestro equipo
        //home/diego/Descargas/Datos_ejemplo.txt
        Path rutaFichero = Paths.get("/home/diego/Descargas/Datos_ejemplo.txt");

        System.out.println("La ruta del fichero es: " + rutaFichero);
        System.out.println("El nombre del fichero es: " + rutaFichero.getFileName());
        System.out.println("La ruta del padre es: " + rutaFichero.getParent());

        try {
            if(Files.isRegularFile(rutaFichero)){
                System.out.println("Es un fichero como tal");
            }

            if(!Files.exists(rutaFichero)){
                System.out.println("El fichero no existe...");
            }
            List<String> contenidoFichero = Files.readAllLines(rutaFichero);

            for (String linea: contenidoFichero){
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e);
        }

    }
}

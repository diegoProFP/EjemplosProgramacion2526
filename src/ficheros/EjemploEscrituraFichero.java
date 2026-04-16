package ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class EjemploEscrituraFichero {

    public static void main(String[] args) {

        Path rutaFichero = Paths.get("Salida2.txt");

        try {

            Files.writeString(rutaFichero, "\n Yassin quiere irse... ", StandardOpenOption.APPEND);
            Files.writeString(rutaFichero, "\n Marcos quiere irse... ", StandardOpenOption.APPEND);
            Files.writeString(rutaFichero, "\n Noelia quiere irse... ", StandardOpenOption.APPEND);
            Files.writeString(rutaFichero, "\n Bea quiere irse... ", StandardOpenOption.APPEND);
            System.out.println("Contenido escrito en: " + rutaFichero);
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero... " + e);
        }


    }
}

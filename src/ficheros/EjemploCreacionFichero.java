package ficheros;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EjemploCreacionFichero {

    public static void main(String[] args) {

        Path rutaFicheroNuevo = Paths.get("Salida2.txt");

        try {
            //Podemos comentar la comprobacion de si existe
//            if (Files.exists(rutaFicheroNuevo)) {
//                System.out.println("El fichero ya existe...");
//            } else {
            Files.createFile(rutaFicheroNuevo);
//            }

        }catch (FileAlreadyExistsException e){
            System.out.println("El fichero ya existe...");
        }catch (IOException e){
            System.out.println("Excepcion al interactuar con el sistema de ficheros. Más info : " + e);
        }

    }
}

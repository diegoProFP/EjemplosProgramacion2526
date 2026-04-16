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
        //Path rutaElemento = Paths.get("/home/diego/Descargas/Datos_ejemplo.txt");
        Path rutaElemento = Paths.get("Salida1.txt");

        System.out.println("La ruta del fichero es: " + rutaElemento);
        System.out.println("El nombre del fichero es: " + rutaElemento.getFileName());
        System.out.println("La ruta del padre es: " + rutaElemento.getParent());

        try {
            if(Files.isRegularFile(rutaElemento)){
                System.out.println("Es un fichero como tal");
            }else if(Files.isDirectory(rutaElemento)){
                System.out.println("Es un directorio");
            }


            if(!Files.exists(rutaElemento)){
                System.out.println("El fichero no existe...");
            }
            List<String> contenidoFichero = Files.readAllLines(rutaElemento);

            for (String linea: contenidoFichero){
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e);
        }

    }
}

package colecciones.ejercicios.spotify;

import java.util.Locale;
import java.util.Scanner;

public class Spotify {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);

        System.out.print("Introduce el nombre de la playlist: ");
        String nombrePlaylist = teclado.nextLine();
        Playlist playlist = new Playlist(nombrePlaylist);

        int opcion;
        do {
            imprimirMenu();
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:
                    playlist.mostrarContenidoPlaylist();
                    break;
                case 2:
                    System.out.print("Nombre de la cancion: ");
                    String nombreCancion = teclado.nextLine();
                    System.out.print("Numero de segundos: ");
                    int segundos = Integer.parseInt(teclado.nextLine());

                    Cancion nueva = new Cancion(nombreCancion, segundos);
                    if (playlist.agregarCancion(nueva)) {
                        System.out.println("Cancion anadida correctamente.");
                    } else {
                        System.out.println("Ya existe una cancion con ese nombre.");
                    }
                    break;
                case 3:
                    System.out.println("Duracion total: " + playlist.obtenerDuracionTotalMinutos() + " minutos.");
                    break;
                case 4:
                    System.out.print("Nombre de la cancion a buscar: ");
                    String nombreBuscado = teclado.nextLine();
                    Cancion encontrada = playlist.obtenerCancionPorNombre(nombreBuscado);

                    if (encontrada == null) {
                        System.out.println("No se encuentra esa cancion en la playlist.");
                    } else {
                        System.out.println(encontrada);
                    }
                    break;
                case 0:
                    System.out.println("Hasta pronto.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 0);
    }

    public static void imprimirMenu() {
        System.out.println();
        System.out.println("1. Mostrar playlist");
        System.out.println("2. Anadir cancion");
        System.out.println("3. Mostrar duracion total de la playlist");
        System.out.println("4. Buscar cancion por nombre");
        System.out.println("0. Salir");
        System.out.print("Elige una opcion: ");
    }
}

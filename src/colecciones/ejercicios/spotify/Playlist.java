package colecciones.ejercicios.spotify;

import java.util.ArrayList;

public class Playlist {

    private String nombre;
    private ArrayList<Cancion> listaCanciones;

    public Playlist(String nombre) {
        this.nombre = nombre;
        this.listaCanciones = new ArrayList<>();
    }

    public boolean agregarCancion(Cancion nueva) {

        if (nueva == null) {
            System.out.println("Cancion nula");
            return false;
        }
        if (listaCanciones.contains(nueva)) {
            System.out.println("Cancion repetida");
            return false;
        }
        return listaCanciones.add(nueva);
    }

    public void agregarCancion(int index, Cancion nueva) {
        if (!listaCanciones.contains(nueva)) {
            listaCanciones.add(index, nueva);
        }
    }

    public boolean eliminarCancion(Cancion aEliminar) {
        return listaCanciones.remove(aEliminar);
    }

    public void eliminarCancionPorIndice(int index) {
        listaCanciones.remove(index);
    }

    public Cancion obtenerCancionPorNombreManual(String nombre) {

        for (Cancion canc : listaCanciones) {
            if(canc.getNombre().toLowerCase().contains(nombre.toLowerCase())){
                System.out.println("Canción encontrada");
                return canc;
            }
        }
        System.out.println("Canción no encontrada: " + nombre);
        return null;
    }

    public Cancion obtenerCancionPorNombre(String nombre) {
        int posicion = listaCanciones.indexOf(new Cancion(nombre, 0));
        if (posicion == -1) {
            return null;
        }
        return listaCanciones.get(posicion);
    }

    public double obtenerDuracionTotalMinutos() {
        int totalSegundos = 0;
        for (Cancion cancion : listaCanciones) {
            totalSegundos += cancion.getNumSegundos();
        }
        return totalSegundos / 60.0;
    }

    public int getNumeroCanciones() {
        return listaCanciones.size();
    }

    public void vaciarPlaylist() {
        listaCanciones.clear();
    }

    public boolean estaVacia() {
        return listaCanciones.isEmpty();
    }

    public void mostrarContenidoPlaylist() {
        System.out.println("Playlist: " + nombre);
        if (estaVacia()) {
            System.out.println("No hay canciones en la playlist.");
            return;
        }

        int numCancion = 1;
        for (Cancion canc : listaCanciones) {
            System.out.println(numCancion + " : " + canc.getNombre() + " |" + canc.getGenero() + " | " + canc.obtenerDuracionMinutos() + " min");
            numCancion++;
        }
    }
}

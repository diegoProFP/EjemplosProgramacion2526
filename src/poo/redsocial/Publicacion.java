package poo.redsocial;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Publicacion {

    public static final int MAX_COMENTARIOS = 10;
    private LocalDateTime fecha;
    private String contenido;
    private Usuario autor;
    private Comentario[] comentarios;
    private int numeroComentarios = 0;

    public Publicacion(Usuario autor, String contenido) {
        this.autor = autor;
        this.contenido = contenido;
        comentarios = new Comentario[MAX_COMENTARIOS];
        fecha = LocalDateTime.now();
    }

    public void agregarComentario(Comentario com){
        if(comentarios != null && numeroComentarios != MAX_COMENTARIOS){
            comentarios[numeroComentarios++] = com;
        }else{
            System.out.println("No caben más comentarios. Se ha alcanzado el máximo de comentarios: " + numeroComentarios);
        }
    }


    public Usuario getAutor() {
        return autor;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Comentario[] getComentarios() {
        return comentarios;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                ", autor=" + autor +
                ", contenido='" + contenido + '\'' +
                ", fecha=" + fecha +
                ", comentarios=" + Arrays.toString(comentarios) +
                '}';
    }
}

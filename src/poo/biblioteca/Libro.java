package poo.biblioteca;

public class Libro {

    private String titulo;
    private String isbn;
    private int numPaginas;
    private String genero;
    private Autor escritor;

    public Libro(String titulo, String isbn, int numPaginas, String genero) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.numPaginas = numPaginas;
        this.genero = genero;
        this.escritor = new Autor();
    }
    public Libro(String titulo, String isbn, int numPaginas, String genero, Autor escritor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.numPaginas = numPaginas;
        this.genero = genero;
        this.escritor = escritor;
    }

    public Autor getEscritor() {
        return escritor;
    }

    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String toString(){
        String cadena = "Titulo: " + titulo + "\n"
                       + "ISBN: " + isbn + "\n"
                       + "Num paginas: " + numPaginas + "\n"
                        + "Genero: " + genero + "\n"
                        + "Autor: " + escritor;
        return cadena;
    }

}

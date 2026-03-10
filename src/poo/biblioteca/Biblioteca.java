package poo.biblioteca;

public class Biblioteca {

    public static int MAX_LIBROS = 10;
    private String nombre;
    private String direccion;
    private Libro[] catalogo;
    private int posicionProxLibro = 0;

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.catalogo = new Libro[MAX_LIBROS];

    }

    public void anyadirLibro(Libro nuevo){

        //si no está lleno el array, puedo meter el libro
        if(posicionProxLibro != MAX_LIBROS){
            catalogo[posicionProxLibro] = nuevo;
            posicionProxLibro++;
        }else{
            //está lleno
            System.out.println("Lo siento, el catálogo está lleno");
        }
    }

    public void mostrarCatalogo(){
        System.out.println(" *** CATALOGO DE LIBROS DE LA BIBLIOTECA: " + nombre + " ***");

        System.out.println("Existen " + posicionProxLibro + " libros");
        if(catalogo != null && posicionProxLibro != 0){
            for(int cont = 0; cont < posicionProxLibro; cont++){
                System.out.println("----------------");
                System.out.println(catalogo[cont]);
            }
        }


    }
    public void mostrarLibrosPorMaxPaginas(int maximo){

        if(catalogo != null && posicionProxLibro != 0){
            for(int cont = 0; cont < posicionProxLibro; cont++){
                Libro uno = catalogo[cont];
                if(uno != null && uno.getNumPaginas() <= maximo){
                    System.out.println("----------------");
                    System.out.println(uno);
                }
            }
        }

    }

    public void mostrarNacionalidadDeAutores(){
        //TODO:
    }
    public void mostrarAutoresPorNacionalidad(String nacionalidad){

        System.out.println("BUSCANDO AUTORES POR NACIONALIDAD: " + nacionalidad);
        if(catalogo != null && posicionProxLibro != 0){
            for (int pos = 0; pos < posicionProxLibro; pos++){
                Libro uno = catalogo[pos];
                Autor escritorDelLibro = uno.getEscritor();
                String nacionalidadEscritor = escritorDelLibro.getNacionalidad();
                if(nacionalidadEscritor.equalsIgnoreCase(nacionalidad)){
                    System.out.println("Coincidencia: " + escritorDelLibro);
                }
            }
        }
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Libro[] getCatalogo() {
        return catalogo;
    }


}

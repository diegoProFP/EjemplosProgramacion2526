package poo.redsocial;

public class ProgramaRedSocial {


    public static final int MAX_PUBLICACIONES = 5;
    private Publicacion[] publicaciones = new Publicacion[MAX_PUBLICACIONES];
    private int contadorPublicaciones = 0;

    public void agregarPublicacion(Publicacion nueva){
        if(contadorPublicaciones == MAX_PUBLICACIONES){
            System.out.println("El muro está lleno. No se aceptan más publicaciones");
        }else{
            publicaciones[contadorPublicaciones] = nueva;
            contadorPublicaciones++;
            System.out.println("- Publicación agregada correctamente. Nº total de publicaciones : " + contadorPublicaciones);
        }

    }

    public void mostrarMuro(){
        if(publicaciones != null && contadorPublicaciones != 0){
            System.out.println("*** CONTENIDO DEL MURO *** \n");
            for(int pos = 0; pos < contadorPublicaciones; pos++){
                //System.out.println(publicaciones[pos]);
                Publicacion pub = publicaciones[pos];
                imprimirPublicacion(pub);
            }
        }else{
            System.out.println("*** NO HAY PUBLICACIONES EN EL MURO *** \n");

        }
    }

    public void mostrarPublicacionConMasComentarios(){
        //TODO
    }
    public int cantidadComentariosSegunProvincia(String provincia){
        //TODO
        return 0;
    }

    private void imprimirPublicacion(Publicacion pub){

        System.out.println("-----------------------------");

        //Imprimir informacion del autor de la publicacion
        imprimirInfoAutor(pub.getAutor(), 0);

        //Imprimir contenido de la publicacion
        System.out.println("-" + pub.getContenido() + " (escrito el " + pub.getFecha() +")");

        Comentario[] comentarios = pub.getComentarios();
        if(comentarios != null){
            //Imprimir comntarios
            System.out.println("\t Comentarios");
            for(int contCom =0; contCom < comentarios.length; contCom++){
                Comentario com = comentarios[contCom];
                if(com != null){
                    //imprimir el autor del comentario
                    imprimirInfoAutor(com.getAutor(), 2);
                    System.out.println("\t\t" + com.getTexto() + " (escrito el " + com.getFecha() +")");
                }
            }
        }

    }

    /**
     * Imprime la informacion de un autor (de publicacion o comentario)
     * El nº de tabuladores para desplazarlo es variable
     * @param autor
     * @param numeroTabuladores El número de tabuladores que queremos poner al principio
     */
    private static void imprimirInfoAutor(Usuario autor, int numeroTabuladores) {

        Direccion dirAutor = autor.getDireccion();
        String provinciaAutor = "sin provincia";
        if(dirAutor != null){
            provinciaAutor = dirAutor.getProvincia();
        }
        //Imprimir info del autor de la pub
        for(int cont= 0; cont < numeroTabuladores; cont++){
            System.out.print("\t");
        }
        System.out.println(String.format("[%s (%s)]", autor.getNick(), provinciaAutor));
    }

}

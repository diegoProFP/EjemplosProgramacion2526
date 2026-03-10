package poo.redsocial;

public class Main {

    public static void main(String[] args) {

        /*
        Crea un Main donde: 1. Crees 2 usuarios con su Direccion . 2. Crees 2 publicaciones (cada una
con un autor). 3. Añadas varios comentarios a una publicación (comentarios con autores distintos). 4.
Muestres el muro completo con mostrarMuro()
         */
        Usuario usuario1 = crearUsuario1();
        Usuario usuario2 = crearUsuario2();

        Publicacion pub1 = new Publicacion(usuario1, "Harto ya del Marquez bla bla bla");
        Publicacion pub2 = new Publicacion(usuario2, "Esperando ya al finde. Besitos");

        Comentario com1SobrePub1 = new Comentario(usuario2, "Ya ves tronco... pesaos");
        Comentario com1SobrePub2 = new Comentario(usuario1, "¿Qué vas a hacer este finde?");

        pub1.agregarComentario(com1SobrePub1);
        pub2.agregarComentario(com1SobrePub2);

        ProgramaRedSocial redSocial = new ProgramaRedSocial();
        redSocial.agregarPublicacion(pub1);
        redSocial.agregarPublicacion(pub2);

        redSocial.mostrarMuro();


    }
    public static Usuario crearUsuario1(){
        //creamos el usuario 1 con su direccion
        Direccion dir = new Direccion("C/ Beatriz Galindo 6", "Madrid", "28456", "España");
        Usuario usuario1 = new Usuario("niñoChulo21", "ninochulo@gmail.com", dir);
        return usuario1;
    }

    public static Usuario crearUsuario2(){
        //creamos el usuario 2 sin direccion
        return new Usuario("laloli", "laloli@gmail.com");
    }


}
